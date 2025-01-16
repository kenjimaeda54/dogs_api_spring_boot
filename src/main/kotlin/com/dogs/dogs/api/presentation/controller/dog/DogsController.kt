package com.dogs.dogs.api.presentation.controller.dog

import com.dogs.dogs.api.application.dto.dog.DogsDTO
import com.dogs.dogs.api.application.usecase.dog.GetDogUseCase
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
    fun getAllDogs(@RequestParam("raca") breed: String?,
                   @RequestParam("afenidadeComFamilia") affectionateFamily: Int?,
                   @RequestParam("afenidadeComAsCriancas") affectionateChildren: Int?,
                   @RequestParam("nivelDiversao") levelFun: Int?,
                   @RequestParam("energia") energy: Int?,
                   @RequestParam("nivelDeLatido") dilation: Int?,
                   @RequestParam("nivelProtecao") levelProtection: Int?
                   ): ResponseEntity<List<DogsDTO>>  {
        val dog = getDogUseCase(
            breed = breed,
            dilation = dilation,
            energy = energy,
            levelProtection = levelProtection,
            levelFun = levelFun,
            affectionateChildren = affectionateChildren,
            affectionateFamily = affectionateFamily
        )
        return ResponseEntity.ok(dog)
    }

}