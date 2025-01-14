package com.dogs.dogs.api.service.dog

import org.springframework.stereotype.Service
import com.dogs.dogs.api.repository.dog.DogRepository
import com.dogs.dogs.api.resources.dogs.DogsModel

//repara qque estou chamando a interface
//nao a classe concreta

@Service
class DogService(
    private val dogRepository: DogRepository
) {

    fun getAllDogs(
        breed: String?,
        affectionateFamily: String?,
        levelFun: String?,
        energy: String?,
        dilation: String?,
        levelProtection: String?,
        affectionateChildren: String?
    ): List<DogsModel> {
       return dogRepository.findAll().toList()
    }

}