package com.dogs.dogs.api.domain.repository.dog

import com.dogs.dogs.api.domain.model.dog.Dog

interface DogRepository {
    fun getAll(listAttributes: List<Pair<String?, Int?>>, breed: String?): List<Dog>
}