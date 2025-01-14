package com.dogs.dogs.api.extension.attribute

import com.dogs.dogs.api.extension.dog.toDogDTO
import com.dogs.dogs.api.controllers.dto.response.attribute.AttributeDTO
import com.dogs.dogs.api.resources.attribute.AttributeModel


fun AttributeModel.toAttributeDTO() = AttributeDTO(
    affectionateChildren = this.affectionateChildren,
    affectionateDogs = this.affectionateDogs,
    affectionateFamily = this.affectionateFamily,
    levelAdaptability = this.levelAdaptability,
    levelFun = this.levelFun,
    levelProtection = this.levelProtection,
    dilation = this.dilation,
    opennessToStrangers = this.opennessToStrangers,
    levelTraining = this.levelTraining,
    energy = this.energy,
    levelPreparationCoat = this.levelPreparationCoat
)