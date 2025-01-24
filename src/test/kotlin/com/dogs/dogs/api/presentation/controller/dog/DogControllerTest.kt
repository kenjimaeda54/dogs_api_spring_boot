package com.dogs.dogs.api.presentation.controller.dog

import com.dogs.dogs.api.application.mapper.dog.DogMapper.toDomain
import com.dogs.dogs.api.application.usecase.dog.GetDogUseCase
import com.dogs.dogs.api.presentation.request.toDto
import com.dogs.dogs.api.presentation.util.MockModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals
import kotlin.test.assertTrue


@ExtendWith(MockKExtension::class)
class DogControllerTest {

    @MockK
    private lateinit var getDogUseCase: GetDogUseCase


    @InjectMockKs
    lateinit var dogController: DogsController

    @Test
    fun `should return all dogs`() {
        val fakeDogs = MockModel.dogsBuilder()

        //se eu passar o valor correto aqui ele ira dar erro
        //porque ira comparar o valor real por isso any()
        //daiu possivelmente vai dar erro
        //porque Pode estar diferente da lista que o controller está realmente montando. Por exemplo:
        //Pode ter espaços extras
        //Pode ter case diferente ("affectionateFamily" vs "affectionate_family")
        //Pode estar incluindo outros pares null que você não esperava
        //A ordem dos elementos pode estar diferente
        every { getDogUseCase(any(), any()) } returns fakeDogs.map { it.toDto() }

        val expected = dogController.getAllDogs(
            breed = null,
            affectionateFamily = null,
            affectionateChildren = null,
            levelFun = null,
            energy = null,
            dilation = null,
            levelProtection = null,
            affectionateDogs = null,
            levelPreparationCoat = null,
            opennessToStrangers = null,
            levelTraining = null
        ).map { it.toDomain() }

        assertEquals(fakeDogs, expected)

    }

    @Test
    fun `should return dog filtered by level protection`() {
        val fakeDogs = MockModel.dogsBuilder()
        val levelProtectionFilter = 4

        val filteredDogs = fakeDogs.filter { it.attribute!!.levelProtection >= levelProtectionFilter }

        //match e para garantir que estou passando o filter correto
        every {
            getDogUseCase.invoke(
                match { it.contains(Pair("levelProtection", levelProtectionFilter)) },
                null
            )
        } returns filteredDogs.map { it.toDto() }

        val expected = dogController.getAllDogs(
            breed = null,
            affectionateFamily = null,
            affectionateChildren = null,
            levelFun = null,
            energy = null,
            dilation = null,
            levelProtection = levelProtectionFilter,
            affectionateDogs = null,
            levelPreparationCoat = null,
            opennessToStrangers = null,
            levelTraining = null
        ).map { it.toDomain() }

        assertEquals(filteredDogs.size, expected.size)
        //so vai dar true se todas condições baterem
        assertTrue(expected.all { it.attribute!!.levelProtection >= levelProtectionFilter }) //

    }


    @Test
    fun `should return dog filtered by multiple attributes`() {
        val fakeDogs = MockModel.dogsBuilder()
        val filters = listOf(
            Pair("affectionateFamily", 1),
            Pair("affectionateChildren", 1),
            Pair("affectionateDogs", 3),
            Pair("levelFun", 1),
            Pair("levelPreparationCoat", 1),
            Pair("opennessToStrangers", 1),
            Pair("levelTraining", 1),
            Pair("levelProtection", 4),
            Pair("energy", 1),
            Pair("dilation", 1)
        )

        //preciso retornaar todos os dogs
        //porque aacima e uma lista completa
        val filteredDogs = fakeDogs.filter { dog ->
            filters.all { (key, value) ->
                when (key) {
                    "levelProtection" -> dog.attribute!!.levelProtection >= value
                    "dilation" -> dog.attribute!!.dilation >= value
                    "affectionateFamily" -> dog.attribute!!.affectionateFamily >= value
                    "affectionateChildren" -> dog.attribute!!.affectionateChildren >= value
                    "affectionateDogs" -> dog.attribute!!.affectionateDogs >= value
                    "energy" -> dog.attribute!!.energy >= value
                    "levelFun" -> dog.attribute!!.levelFun >= value
                    "opennessToStrangers" -> dog.attribute!!.opennessToStrangers >= value
                    "levelPreparationCoat" -> dog.attribute!!.levelPreparationCoat >= value
                    "levelTraining" -> dog.attribute!!.levelTraining >= value
                    else -> true
                }
            }
        }

        // preciso passar o filter correto
        every {
            getDogUseCase.invoke(
                match { incomingFilters ->
                    filters.all { it in incomingFilters }
                },
                null
            )
        } returns filteredDogs.map { it.toDto() }

        //repaara que os outros atributos tem numero 1
        //enttao tenho que passar esse valor e nao null
        val expected = dogController.getAllDogs(
            breed = null,
            affectionateFamily = 1,
            affectionateChildren = 1,
            levelFun = 1,
            energy = 1,
            dilation = 1,
            levelProtection =4,
            affectionateDogs = 3,
            levelPreparationCoat = 1,
            opennessToStrangers = 1,
            levelTraining = 1,
        ).map { it.toDomain() }

        assertEquals(filteredDogs.size, expected.size)

        assertTrue(expected.all { dog ->
            filters.all { (key, value) ->
                when (key) {
                    "levelProtection" -> dog.attribute!!.levelProtection >= value
                    "dilation" -> dog.attribute!!.dilation >= value
                    "affectionateFamily" -> dog.attribute!!.affectionateFamily >= value
                    "affectionateChildren" -> dog.attribute!!.affectionateChildren >= value
                    "affectionateDogs" -> dog.attribute!!.affectionateDogs >= value
                    "energy" -> dog.attribute!!.energy >= value
                    "levelFun" -> dog.attribute!!.levelFun >= value
                    "opennessToStrangers" -> dog.attribute!!.opennessToStrangers >= value
                    "levelPreparationCoat" -> dog.attribute!!.levelPreparationCoat >= value
                    "levelTraining" -> dog.attribute!!.levelTraining >= value
                    else -> true
                }
            }
        })
    }

    @Test
    fun `should return dog filtered by name`() {
        val fakeDogs = MockModel.dogsBuilder()
        val dogName = "Damaltas"

        val filteredDogs = fakeDogs.filter { it.breed == dogName }

        every { getDogUseCase.invoke(
            any(),match { it == dogName   }) } returns filteredDogs.map { it.toDto() }

       val expected = dogController.getAllDogs(
           breed = dogName,
           affectionateFamily = null,
           affectionateChildren = null,
           levelFun = null,
           energy = null,
           dilation = null,
           levelProtection = null,
           affectionateDogs = null,
           levelPreparationCoat = null,
           opennessToStrangers = null,
           levelTraining = null,
       )

        assertEquals(filteredDogs.first().breed, expected.first().breed)
        assertEquals(filteredDogs.size, expected.size)

    }

    @Test
    fun `should return dog filtered by name and attribute`() {
        val fakeDogs = MockModel.dogsBuilder()
        val dogName = "Damaltas"
        val dilation = 4

        val filteredDogs = fakeDogs.filter { it.breed == dogName || it.attribute!!.dilation >= dilation }

        every { getDogUseCase.invoke(
            match { it.contains(Pair("dilation" , dilation)) },match { it == dogName   }) } returns filteredDogs.map { it.toDto() }

        val expected = dogController.getAllDogs(
            breed = dogName,
            affectionateFamily = null,
            affectionateChildren = null,
            levelFun = null,
            energy = null,
            dilation = 4,
            levelProtection = null,
            affectionateDogs = null,
            levelPreparationCoat = null,
            opennessToStrangers = null,
            levelTraining = null,
        )

        assertEquals(filteredDogs.first().breed, expected.first().breed)
        assertEquals(filteredDogs.size, expected.size)

    }
}