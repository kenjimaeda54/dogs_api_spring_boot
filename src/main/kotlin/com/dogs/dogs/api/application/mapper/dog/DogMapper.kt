package com.dogs.dogs.api.application.mapper.dog

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.application.mapper.attribute.AttributeMapper.toDomain
import com.dogs.dogs.api.application.mapper.attribute.AttributeMapper.toDto
import com.dogs.dogs.api.application.mapper.attribute.AttributeMapper.toResponse
import com.dogs.dogs.api.application.mapper.dog.DogMapper.toDomain
import com.dogs.dogs.api.domain.model.dog.Dog
import com.dogs.dogs.api.presentation.response.dog.DogResponse

object DogMapper {

    fun Dog.toDto() = DogsDTO(
        id = this.id ?: 0,
        breed = this.breed,
        description = this.description,
        photos = this.photos,
        attribute = this.attribute?.toDto()
    )

    fun DogsDTO.toResponse() = DogResponse(
        breed = this.breed,
        description = this.description,
        photos = this.photos,
        attribute = this.attribute?.toResponse(),
        id = this.id ?: 0
    )

    fun DogsDTO.toDomain(): Dog = Dog(
        id = this.id,
        breed = this.breed,
        description = this.description,
        photos = this.photos,
        attribute = this.attribute?.toDomain()
    )

}