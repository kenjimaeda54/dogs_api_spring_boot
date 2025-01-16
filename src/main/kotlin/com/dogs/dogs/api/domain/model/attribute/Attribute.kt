package com.dogs.dogs.api.domain.model.attribute

data class Attribute(
    val id: Int? = null,
    val affectionateFamily: Int,
    val affectionateChildren: Int,
    val affectionateDogs: Int,
    val levelPreparationCoat: Int,
    val levelFun: Int,
    val opennessToStrangers: Int,
    val levelAdaptability: Int,
    val levelTraining: Int,
    val levelProtection: Int,
    val energy: Int,
    val dilation: Int
)
