package com.dogs.dogs.api.resources.dogs

import jakarta.persistence.*
import com.dogs.dogs.api.resources.attribute.AttributeModel

@Entity
@Table(name = "DOG")
data class DogsModel(
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
    val attribute: AttributeModel? = null
)
