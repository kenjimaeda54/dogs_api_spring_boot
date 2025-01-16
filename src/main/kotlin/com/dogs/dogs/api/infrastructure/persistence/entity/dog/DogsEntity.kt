package com.dogs.dogs.api.infrastructure.persistence.entity.dog

import com.dogs.dogs.api.domain.model.dog.Dog
import jakarta.persistence.*
import com.dogs.dogs.api.infrastructure.persistence.entity.attribute.AttributeEntity
import com.dogs.dogs.api.infrastructure.persistence.entity.attribute.toDomain
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

@Entity
@Table(name = "DOG")
data class DogsEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(nullable = false)
    val breed: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val photos: String,

    @OneToOne(mappedBy = "dog", cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = true)
    val attribute: AttributeEntity? = null
)


fun DogsEntity.toDomain(): Dog  {
    val photoList = try {
        jacksonObjectMapper().readValue(this.photos, Array<String>::class.java).toList()
    } catch (e: JsonProcessingException) {
        emptyList()
    }

    return Dog(
        id = this.id ?: 0,
        breed = this.breed,
        description = this.description,
        photos = photoList,
        attribute = this.attribute?.toDomain()
    )
}