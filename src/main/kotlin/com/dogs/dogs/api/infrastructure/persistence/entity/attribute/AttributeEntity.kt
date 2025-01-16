package com.dogs.dogs.api.infrastructure.persistence.entity.attribute

import com.dogs.dogs.api.domain.model.attribute.Attribute
import jakarta.persistence.*
import com.dogs.dogs.api.infrastructure.persistence.entity.dog.DogsEntity

@Entity
@Table(name = "ATTRIBUTE")
data class AttributeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    //preciso disso para fazzer relação com a tabel dogsModel
    //la esta mapeado dog que o mesmo nome que esta aqui
    //@OneToOne(mappedBy = "dog", cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = true)
    @OneToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "dog_id", referencedColumnName = "id")
    val dog: DogsEntity? = null,

    @Column(nullable = false)
    val affectionateFamily: Int,

    @Column(nullable = false)
    val affectionateChildren: Int,

    @Column(nullable = false)
    val affectionateDogs: Int,

    @Column(nullable = false)
    val levelPreparationCoat: Int,

    @Column(nullable = false, name = "fun")
    val levelFun: Int,

    @Column(nullable = false)
    val opennessToStrangers: Int,

    @Column(nullable = false)
    val levelAdaptability: Int,

    @Column(nullable = false)
    val levelTraining: Int,

    @Column(nullable = false)
    val levelProtection: Int,

    @Column(nullable = false)
    val energy: Int,

    @Column(nullable = false)
    val dilation: Int
)

fun AttributeEntity.toDomain() = Attribute(
        affectionateChildren = this.affectionateChildren,
        affectionateDogs = this.affectionateDogs,
        affectionateFamily = this.affectionateFamily,
        levelAdaptability = this.levelAdaptability,
        levelFun = this.levelFun,
        levelProtection = this.levelProtection,
        dilation = this.dilation,
        opennessToStrangers = this.opennessToStrangers,
        levelTraining = this.levelTraining,
        energy = this.energy,
        levelPreparationCoat = this.levelPreparationCoat
)