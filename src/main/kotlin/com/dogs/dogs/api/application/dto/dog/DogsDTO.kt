package com.dogs.dogs.api.application.dto.dog

import com.dogs.dogs.api.application.dto.attribute.AttributeDTO

data class DogsDTO (
    val id: Int,
    val breed: String,
    val description: String,
    val photos: List<String>,
    val attribute: AttributeDTO? = null
)