package com.dogs.dogs.api.presentation.controller.dog

import com.dogs.dogs.api.application.mapper.dog.DogMapper.toResponse
import com.dogs.dogs.api.application.usecase.dog.GetByIdUseCase
import com.dogs.dogs.api.application.usecase.dog.GetDogUseCase
import com.dogs.dogs.api.presentation.response.dog.DogResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private const val REQUEST_MAPPING = "dogs"

@RestController
@RequestMapping(REQUEST_MAPPING)
class DogsController(
    private val getDogUseCase: GetDogUseCase,
    private val getByBreedsUseCase: GetByIdUseCase,
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
    ):List<DogResponse> {
        val dog = getDogUseCase(
            listFilterAttributes = listOf(
                Pair(
                    "affectionateFamily",
                    affectionateFamily
                ),
                Pair(
                    "affectionateChildren",
                    affectionateChildren
                ),
                Pair(
                    "affectionateDogs",
                    affectionateDogs
                ),
                Pair(
                    "levelFun",
                    levelFun
                ),
                Pair(
                    "levelPreparationCoat",
                    levelPreparationCoat
                ),
                Pair(
                    "opennessToStrangers",
                    opennessToStrangers
                ),
                Pair(
                    "levelTraining",
                    levelTraining
                ),
                Pair(
                    "levelProtection",
                    levelProtection
                ),
                Pair(
                    "energy",
                    energy
                ),
                Pair(
                    "dilation",
                    dilation
                ),
            ),
            breed = breed
        ).map { it.toResponse() }
        return dog
    }

    @GetMapping("/{id}")
    fun searchDog(
       @PathVariable("id") id: Int,
    ): DogResponse  = getByBreedsUseCase(id).toResponse()

}