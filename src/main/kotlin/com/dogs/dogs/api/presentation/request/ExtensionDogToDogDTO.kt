package com.dogs.dogs.api.presentation.request

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.application.mapper.attribute.AttributeMapper.toDto
import com.dogs.dogs.api.domain.model.dog.Dog

fun Dog.toDto() = DogsDTO(
    id = this.id ?: 0,
    breed = this.breed,
    description = this.description,
    photos = this.photos,
    attribute = this.attribute?.toDto()
)