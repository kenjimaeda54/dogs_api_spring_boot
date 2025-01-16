package com.dogs.dogs.api.infrastructure.persistence.repository.impl.dog

import com.dogs.dogs.api.domain.model.dog.Dog
import com.dogs.dogs.api.domain.repository.dog.DogRepository
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.toDomain
import com.dogs.dogs.api.infrastructure.persistence.repository.dog.DogJpaRepository
import org.springframework.stereotype.Repository

@Repository
class DogRepositoryImpl(
    private val jpaRepository: DogJpaRepository
): DogRepository {

    override fun getAll(): List<Dog>  = jpaRepository.findAll().map { it.toDomain() }

}