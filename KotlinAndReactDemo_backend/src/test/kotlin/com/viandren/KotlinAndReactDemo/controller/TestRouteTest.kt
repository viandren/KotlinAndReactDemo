package com.viandren.KotlinAndReactDemo.controller

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.reactive.server.WebTestClient

internal class TestRouteTest {

    lateinit var client: WebTestClient

    @BeforeEach
    fun init() {
        this.client = WebTestClient.bindToRouterFunction(TestRoute().route()).build()
    }


    @Test
    fun whenRequestToRoute_thenStatusShouldBeOk() {
        client.get()
            .uri("/route")
            .exchange()
            .expectStatus().isOk
    }

}