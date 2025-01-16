package com.dogs.dogs.api.infrastructure.persistence.repository.dog

import com.dogs.dogs.api.infrastructure.persistence.entity.dog.DogsEntity
import org.springframework.data.repository.CrudRepository

interface DogJpaRepository: CrudRepository<DogsEntity,Int>  {
}