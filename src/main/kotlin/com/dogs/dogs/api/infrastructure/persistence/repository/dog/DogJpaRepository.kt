package com.dogs.dogs.api.infrastructure.persistence.repository.dog

import com.dogs.dogs.api.domain.model.attribute.AttributeValue
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.DogsEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface DogJpaRepository: CrudRepository<DogsEntity,Int>  {

}