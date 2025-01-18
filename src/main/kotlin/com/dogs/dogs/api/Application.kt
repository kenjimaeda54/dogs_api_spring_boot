package com.dogs.dogs.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


//em arquitetura limpa
//application e responsavel por orquestrar os fluxos de dados entre domain layer e outras layers
//por isso fica os DTO,useCase e seus mapers

//domain seria o core da clean arquitetura e onde fica as regras de negocios e as entidades
//por isso model esta aqui representaa entidde do app(nao tem depedencia de framework
// represetna conseeitos de negocios) é o reposity que nossa regra de negocio

//infrasturea responvael por implemetnar os detalhes e as interfaces externas como os repsotorios

//presentation seria a camada que fica visual do app nesse caso os controllers

//domain
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
