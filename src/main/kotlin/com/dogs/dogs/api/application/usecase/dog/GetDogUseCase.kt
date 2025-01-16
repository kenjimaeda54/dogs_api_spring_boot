package com.dogs.dogs.api.application.usecase.dog

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.domain.repository.dog.DogRepository
import com.dogs.dogs.api.presentation.request.toDto
import org.springframework.stereotype.Component


// invoke e como se fosse o construtor padrao
//etnao para usar simplesemten instancio o GetDogUseCase
//olhaaara em controlers
@Component
class GetDogUseCase(private val dogRepository: DogRepository) {
    operator fun invoke(
        breed: String?,
        dilation: Int?,
        energy: Int?,
        levelProtection: Int?,
        levelFun: Int?,
        affectionateChildren: Int?,
        affectionateFamily: Int?
    ): List<DogsDTO>  = dogRepository.getAll().map { it.toDto() }
}