package com.dogs.dogs.api.infrastructure.persistence.repository.impl.dog

import com.dogs.dogs.api.domain.model.dog.Dog
import com.dogs.dogs.api.domain.repository.dog.DogRepository
import com.dogs.dogs.api.infrastructure.persistence.entity.attribute.AttributeEntity
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.DogsEntity
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.toDomain
import com.dogs.dogs.api.infrastructure.persistence.repository.dog.DogJpaRepository
import jakarta.persistence.EntityManager
import jakarta.persistence.criteria.Predicate
import org.springframework.stereotype.Repository


@Repository
class DogRepositoryImpl(
    private val jpaRepository: DogJpaRepository,
    private val entityManager: EntityManager
) : DogRepository {

    //por ser um dados complexo estou usndo o Criteria API do JPA,

    override fun getAll(listAttributes: List<Pair<String?, Int?>>, breed: String?): List<Dog> {
        val criteriaBuilder = entityManager.criteriaBuilder
        val criteriaQuery = criteriaBuilder.createQuery(DogsEntity::class.java)
        val root = criteriaQuery.from(DogsEntity::class.java)

        val predicates = mutableListOf<Predicate>()

        //maaneira de retornar se contem
        breed?.let {
            predicates.add(criteriaBuilder.like(
                criteriaBuilder.lower(root.get("breed")),
                "%${breed.lowercase()}%"
            ))
        }

        val attributesJoin = root.join<DogsEntity, AttributeEntity>("attribute")

        listAttributes.forEach { attributes ->
             val (name,value) = attributes
            //para comparar preciso ter certeza que o value sera Int
            //se nao ira da erro TypeVariable(y)

            //eu estou envinado ja o nome da a columnaa entao
            //criteriaBuilder.greaterThanOrEqualTo(attributesJoin.get(attributeValue.name), value)
            // na linhaa acima vai pegar a columna affectionateFamily e comparar o vaalor envaido par saber se maiorOuIgual
            //se for ele adicona no predicates
            value?.let {
                predicates.add(
                    criteriaBuilder.and(
                        criteriaBuilder.greaterThanOrEqualTo(attributesJoin.get(name), value)
                    )
                )
            }

        }

        criteriaQuery.where(*predicates.toTypedArray())

        //remove o duplicado
        criteriaQuery.distinct(true)

        return entityManager.createQuery(criteriaQuery)
            .resultList
            .map { it.toDomain() }
    }

    override fun getById(breed: Int): Dog = jpaRepository.findById(breed).orElseThrow {
        RuntimeException("Dog not found")
    }.toDomain()



}