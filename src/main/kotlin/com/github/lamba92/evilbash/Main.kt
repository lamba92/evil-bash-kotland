package com.github.lamba92.evilbash

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    embeddedServer(CIO, port = 8081) {
        routing {
            get("/") {
                call.respondText("Hello Kotland!")
            }
        }
    }.start(true)
}