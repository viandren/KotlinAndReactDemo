package com.viandren.KotlinAndReactDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.viandren"])
class KotlinAndReactDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinAndReactDemoApplication>(*args)
}
