package com.dogs.dogs.api.presentation.response.dog

import com.dogs.dogs.api.presentation.response.attribute.AttributeResponse

data class DogResponse (
    val id: Int,
    val breed: String,
    val description: String,
    val photos: List<String>,
    val attribute: AttributeResponse? = null
)