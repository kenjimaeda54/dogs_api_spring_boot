package com.dogs.dogs.api.repository.dog

import com.dogs.dogs.api.resources.dogs.DogsModel
import jakarta.persistence.criteria.CriteriaBuilder.In
import org.springframework.data.repository.CrudRepository


interface DogRepository: CrudRepository<DogsModel,Int> {

}