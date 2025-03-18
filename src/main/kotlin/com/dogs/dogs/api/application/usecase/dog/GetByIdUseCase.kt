package com.dogs.dogs.api.application.usecase.dog

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.application.mapper.dog.DogMapper.toDto
import com.dogs.dogs.api.domain.repository.dog.DogRepository
import org.springframework.stereotype.Component

@Component
class GetByIdUseCase(private val dogRepository: DogRepository) {
    operator fun invoke(
       id: Int
    ): DogsDTO = dogRepository.getById(id).toDto()
}