package com.dogs.dogs.api.presentation.controller.dog

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.application.usecase.dog.GetDogUseCase
import com.dogs.dogs.api.domain.model.attribute.AttributeValue
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private const val REQUEST_MAPPING = "dogs"

@RestController
@RequestMapping(REQUEST_MAPPING)
class DogsController(
    private val getDogUseCase: GetDogUseCase,
) {

    @GetMapping
    fun getAllDogs(
        @RequestParam("raça") breed: String?,
        @RequestParam("afenidadecomfamilia") affectionateFamily: Int?,
        @RequestParam("afenidadecomascrianças") affectionateChildren: Int?,
        @RequestParam("niveldiversão") levelFun: Int?,
        @RequestParam("energia") energy: Int?,
        @RequestParam("niveldelatido") dilation: Int?,
        @RequestParam("nivelproteção") levelProtection: Int?,
        @RequestParam("afenidadecomcachorros") affectionateDogs: Int?,
        @RequestParam("tempodecorte") levelPreparationCoat: Int?,
        @RequestParam("abertoaestranhos") opennessToStrangers: Int?,
        @RequestParam("niveldetreinamento") levelTraining: Int?
    ): ResponseEntity<List<DogsDTO>> {
        val dog = getDogUseCase(
            listFilterAttributes = listOf(
                AttributeValue(
                    name = "affectionateFamily",
                    value = affectionateFamily
                ),
                AttributeValue(
                    name = "affectionateChildren",
                    value = affectionateChildren
                ),
                AttributeValue(
                    name = "affectionateDogs",
                    value = affectionateDogs
                ),
                AttributeValue(
                    name = "levelFun",
                    value = levelFun
                ),
                AttributeValue(
                    name = "levelPreparationCoat",
                    value = levelPreparationCoat
                ),
                AttributeValue(
                    name = "dilation",
                    value = dilation
                ),
                AttributeValue(
                    name = "opennessToStrangers",
                    value = opennessToStrangers
                ),
                AttributeValue(
                    name = "levelTraining",
                    value = levelTraining
                ),
                AttributeValue(
                    name = "levelProtection",
                    value = levelProtection
                ),
                AttributeValue(
                    name = "energy",
                    value = energy
                ),
                AttributeValue(
                    name = "dilation",
                    value = dilation
                ),
            ),
            breed = breed
        )
        return ResponseEntity.ok(dog)
    }

}