package br.com.fiap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TechChallengeApplication

fun main(args: Array<String>) {
    runApplication<TechChallengeApplication>(*args)
}