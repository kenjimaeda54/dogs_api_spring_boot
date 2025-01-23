package com.dogs.dogs.api.presentation.util


import com.dogs.dogs.api.domain.model.attribute.Attribute
import com.dogs.dogs.api.domain.model.dog.Dog

object MockModel {

    fun  dogsBuilder() = listOf(
        Dog(
            id = 1,
            breed = "Fox Paulistinha",
            description = "description",
            photos = listOf("photo1", "photo2"),
            attribute = Attribute(
                id = 1,
                affectionateFamily = 1,
                affectionateChildren = 1,
                affectionateDogs = 5,
                levelPreparationCoat = 1,
                levelTraining = 1,
                opennessToStrangers = 1,
                levelProtection = 6,
                energy = 1,
                dilation = 1,
                levelAdaptability = 1,
                levelFun = 1
            )
        ),
        Dog(
            id = 1,
            breed = "Pastor Alemão",
            description = "description",
            photos = listOf("photo1", "photo2"),
            attribute = Attribute(
                id = 1,
                affectionateFamily = 1,
                affectionateChildren = 1,
                affectionateDogs = 3,
                levelPreparationCoat = 1,
                levelTraining = 1,
                opennessToStrangers = 1,
                levelProtection = 5,
                energy = 1,
                dilation = 1,
                levelAdaptability = 4,
                levelFun = 1
            )
        ),
        Dog(
            id = 1,
            breed = "Damaltas",
            description = "description",
            photos = listOf("photo1", "photo2"),
            attribute = Attribute(
                id = 1,
                affectionateFamily = 1,
                affectionateChildren = 1,
                affectionateDogs = 3,
                levelPreparationCoat = 1,
                levelTraining = 1,
                opennessToStrangers = 1,
                levelProtection = 1,
                energy = 1,
                dilation = 3,
                levelAdaptability = 4,
                levelFun = 1
            )
        )

    )

}