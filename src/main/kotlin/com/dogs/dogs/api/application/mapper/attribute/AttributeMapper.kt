package com.dogs.dogs.api.application.mapper.attribute

import com.dogs.dogs.api.application.dto.attribute.AttributeDTO
import com.dogs.dogs.api.domain.model.attribute.Attribute

object AttributeMapper {

    fun Attribute.toDto() = AttributeDTO(
        id = this.id,
        affectionateFamily = this.affectionateFamily,
        affectionateChildren = this.affectionateChildren,
        affectionateDogs = this.affectionateDogs,
        levelPreparationCoat = this.levelPreparationCoat,
        levelTraining = this.levelTraining,
        opennessToStrangers = this.opennessToStrangers,
        levelProtection = this.levelProtection,
        energy = this.energy,
        dilation = this.dilation,
        levelAdaptability = this.levelAdaptability,
        levelFun = this.levelFun,
    )

    fun AttributeDTO.toDomain() = Attribute(
        id = this.id,
        affectionateFamily = this.affectionateFamily,
        affectionateChildren = this.affectionateChildren,
        affectionateDogs = this.affectionateDogs,
        levelPreparationCoat = this.levelPreparationCoat,
        levelFun = this.levelFun,
        opennessToStrangers = this.opennessToStrangers,
        levelTraining = this.levelTraining,
        levelProtection = this.levelProtection,
        levelAdaptability = this.levelAdaptability,
        energy = this.energy,
        dilation = this.dilation,
    )
}