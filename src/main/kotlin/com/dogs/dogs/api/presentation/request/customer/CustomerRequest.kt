package com.dogs.dogs.api.presentation.request.customer

import com.fasterxml.jackson.annotation.JsonAlias
import org.jetbrains.annotations.NotNull

data class CustomerRequest (
    @field:NotNull
    val phone: String,
    @field:NotNull
    val name: String,
    @JsonAlias("photo_url")
    val photoUrl: String
)