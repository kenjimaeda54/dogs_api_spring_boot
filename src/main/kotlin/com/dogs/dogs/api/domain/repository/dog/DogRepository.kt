package com.dogs.dogs.api.domain.repository.dog

import com.dogs.dogs.api.domain.model.attribute.AttributeValue
import com.dogs.dogs.api.domain.model.dog.Dog

interface DogRepository {
    fun getAll(listAttributes: List<AttributeValue>, breed: String?): List<Dog>
}