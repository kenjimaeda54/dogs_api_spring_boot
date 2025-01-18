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
        listFilterAttributes: List<Pair<String?, Int?>>,
        breed: String?
    ): List<DogsDTO>  = dogRepository.getAll(listAttributes = listFilterAttributes, breed = breed).map { it.toDto() }
}