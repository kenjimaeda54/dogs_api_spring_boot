package com.dogs.dogs.api.application.dto.attribute

import com.fasterxml.jackson.annotation.JsonProperty

data class AttributeDTO(
    val id: Int? = null,
    val affectionateFamily: Int,
    val affectionateChildren: Int,
    val affectionateDogs: Int,
    val levelPreparationCoat: Int,
    val levelFun: Int,
    val levelAdaptability: Int,
    val opennessToStrangers: Int,
    val levelTraining: Int,
    val levelProtection: Int,
    val energy: Int,
    val dilation: Int
)