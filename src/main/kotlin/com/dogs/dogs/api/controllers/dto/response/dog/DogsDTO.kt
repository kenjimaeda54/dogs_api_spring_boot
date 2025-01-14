package com.dogs.dogs.api.controllers.dto.response.dog

import com.dogs.dogs.api.controllers.dto.response.attribute.AttributeDTO

data class DogsDTO (
    val id: Int,
    val breed: String,
    val description: String,
    val photos: List<String>,
    val attribute: AttributeDTO? = null
)