package com.dogs.dogs.api.controllers

import com.dogs.dogs.api.extension.dog.toDogDTO
import com.dogs.dogs.api.controllers.dto.response.dog.DogsDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.dogs.dogs.api.service.dog.DogService

private const val REQUEST_MAPPING = "dogs"

@RestController
@RequestMapping(REQUEST_MAPPING)
class DogsController(
    private  val dogService: DogService
) {

    @GetMapping
    fun getAllDogs(@RequestParam("raca") breed: String?,
                  @RequestParam("afenidadeComFamilia") affectionateFamily: String?,
                   @RequestParam("afenidadeComAsCriancas") affectionateChildren: String?,
                   @RequestParam("nivelDiversao") levelFun: String?,
                   @RequestParam("energia") energy: String?,
                   @RequestParam("nivelDeLatido") dilation: String?,
                   @RequestParam("nivelProtecao") levelProtection: String?
                   ): List<DogsDTO> = dogService.getAllDogs(
                       breed = breed,
                       dilation = dilation,
                       energy = energy,
                       levelProtection = levelProtection,
                       levelFun = levelFun,
                       affectionateChildren = affectionateChildren,
                       affectionateFamily = affectionateFamily
                   ).map { it.toDogDTO() }

}