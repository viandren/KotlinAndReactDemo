package com.viandren.KotlinAndReactDemo.controller

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.client.WebClient

@Component
class TestRoute {

    @Bean
    fun route() = router {
        println("route works")

        GET("/route") { _ -> ServerResponse.ok().body(fromValue(arrayOf(1, 2, 3))) }
    }



}