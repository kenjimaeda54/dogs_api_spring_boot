package com.dogs.dogs.api.presentation.response.attribute

import com.fasterxml.jackson.annotation.JsonProperty

data class AttributeResponse (
    val id: Int? = null,
    @JsonProperty("affectionate_family")
    val affectionateFamily: Int,
    @JsonProperty("affectionate_children")
    val affectionateChildren: Int,
    @JsonProperty("affectionate_dogs")
    val affectionateDogs: Int,
    @JsonProperty("level_preparation_coat")
    val levelPreparationCoat: Int,
    @JsonProperty("level_fun")
    val levelFun: Int,
    @JsonProperty("level_adaptability")
    val levelAdaptability: Int,
    @JsonProperty("openness_to_strangers")
    val opennessToStrangers: Int,
    @JsonProperty("level_training")
    val levelTraining: Int,
    @JsonProperty("level_protection")
    val levelProtection: Int,
    val energy: Int,
    val dilation: Int
)