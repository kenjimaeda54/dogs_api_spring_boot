package com.dogs.dogs.api.extension.dog

import com.dogs.dogs.api.extension.attribute.toAttributeDTO
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.dogs.dogs.api.controllers.dto.response.dog.DogsDTO
import com.dogs.dogs.api.resources.dogs.DogsModel
import com.fasterxml.jackson.core.JsonProcessingException

fun DogsModel.toDogDTO(): DogsDTO  {
    val photoList = try {
        jacksonObjectMapper().readValue(this.photos, Array<String>::class.java).toList()
    }catch (e: JsonProcessingException) {
        emptyList()
    }

    return DogsDTO(
        id = this.id ?: 0,
        breed = this.breed,
        description = this.description,
        photos = photoList,
        attribute = this.attribute?.toAttributeDTO()
    )
}