package com.dogs.dogs.api.domain.model.dog

import com.dogs.dogs.api.domain.model.attribute.Attribute

data class Dog(
    val  id: Int?,
    val breed: String,
    val description: String,
    val photos: List<String>,
    val attribute: Attribute? = null
)