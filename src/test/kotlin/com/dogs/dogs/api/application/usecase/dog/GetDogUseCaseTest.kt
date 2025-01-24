package com.dogs.dogs.api.application.usecase.dog

import com.dogs.dogs.api.domain.repository.dog.DogRepository
import com.dogs.dogs.api.presentation.util.MockModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class GetDogUseCaseTest {

    @MockK
    private lateinit var dogRepository: DogRepository

    @InjectMockKs
    private lateinit var getDogUseCase: GetDogUseCase


    @Test
    fun `should return all dogs`() {
        val fakeDog = MockModel.dogsBuilder()

        every { dogRepository.getAll(any(), any()) } returns fakeDog

        val expected = getDogUseCase.invoke(listOf(), null)

        assertEquals(fakeDog.size, expected.size)
    }

    @Test
    fun `should return dogs filtered by attribute`() {
        val fakeDog = MockModel.dogsBuilder()
        val listFilterAttributes = listOf(Pair("dilation", 3))
        //codiigo estaa bem separdo
        //por iisso posso fzer tranquilo esse filter
        //que com o expected de fto ele ira faazer oque esper ana cmada real
        val dogFiltered = fakeDog.filter { it.attribute!!.dilation >= 4 }

        every {
            dogRepository.getAll(
                match { incomingFilters -> listFilterAttributes.all { it in incomingFilters } },
                any()
            )
        } returns dogFiltered

        val expected = getDogUseCase.invoke(listFilterAttributes, null)

        assertEquals(dogFiltered.size, expected.size)
    }

    @Test
    fun `should return dogs filtered by multiples attributes`() {
        val fakeDog = MockModel.dogsBuilder()
        val listFilterAttributes = listOf(Pair("affectionateDogs", 3), Pair("levelProtection", 4))
        //codiigo estaa bem separdo
        //por iisso posso fzer tranquilo esse filter
        //que com o expected de fto ele ira faazer oque esper ana cmada real
        val dogFiltered = fakeDog.filter { it.attribute!!.affectionateDogs >= 3 && it.attribute!!.levelProtection >= 4 }

        every {
            dogRepository.getAll(
                match { incomingFilters -> listFilterAttributes.all { it in incomingFilters } },
                any()
            )
        } returns dogFiltered

        val expected = getDogUseCase.invoke(listFilterAttributes, null)

        assertEquals(dogFiltered.size, expected.size)
    }

    @Test
    fun `should return dogs filtered by name and attributes`() {
        val fakeDog = MockModel.dogsBuilder()
        val listFilterAttributes = listOf(Pair("affectionateDogs", 3), Pair("levelProtection", 4))
        val dogName = "Damaltas"
        //codiigo estaa bem separdo
        //por iisso posso fzer tranquilo esse filter
        //que com o expected de fto ele ira faazer oque esper ana cmada real
        val dogFiltered = fakeDog.filter {
            it.attribute!!.affectionateDogs >= 3 && it.attribute!!.levelProtection >= 4
                    || it.breed == dogName
        }

        every {
            dogRepository.getAll(
                match { incomingFilters -> listFilterAttributes.all { it in incomingFilters } },
                match { it == dogName }
            )
        } returns dogFiltered

        val expected = getDogUseCase.invoke(listFilterAttributes, dogName)

        assertEquals(dogFiltered.size, expected.size)
    }

}