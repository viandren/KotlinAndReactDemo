package com.viandren.KotlinAndReactDemo.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): String{
        return "Ok"
    }

    @GetMapping(path = ["/numbers"],
        produces = [MediaType.APPLICATION_NDJSON_VALUE])
    @ResponseBody
    fun getNumbers() = Flux.range(1, 100)
}