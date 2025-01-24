package com.dogs.dogs.api.infrastructure.persistence.repository.impl.dog

import com.dogs.dogs.api.application.mapper.dog.DogMapper.toDto
import com.dogs.dogs.api.infrastructure.persistence.entity.attribute.AttributeEntity
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.DogsEntity
import com.dogs.dogs.api.infrastructure.persistence.repository.dog.DogJpaRepository
import com.dogs.dogs.api.presentation.util.MockModel
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import jakarta.persistence.EntityManager
import jakarta.persistence.TypedQuery
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class DogRepositoryImplementationTest {

    @MockK
    private lateinit var dogJpaRepository: DogJpaRepository

    @MockK
    private lateinit var entityManager: EntityManager

    @InjectMockKs
    private lateinit var dogRepository: DogRepositoryImpl

    @Test
    fun `should return  all dogs`() {
       val fakeDogs = MockModel.dogsBuilder()

        every { entityManager.createQuery(any(),DogsEntity::class.java  ) } returns mockk<TypedQuery<DogsEntity>> {
            every { resultList } returns listOf(
                DogsEntity(
                    id = 1,
                    breed = "dog1",
                    attribute = AttributeEntity(
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
                    ),
                    description = "description1",
                    photos = "[\"photo1\", \"photo2\"]"
                )
            )
        }

        // Act

    }



}