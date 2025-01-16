package com.dogs.dogs.api.domain.repository.dog

import com.dogs.dogs.api.domain.model.dog.Dog

interface DogRepository {
    fun getAll(): List<Dog>
}