package blog

import org.jetbrains.ktor.routing.*
import org.jetbrains.ktor.host.*
import org.jetbrains.ktor.http.*
import org.jetbrains.ktor.response.*
import org.jetbrains.ktor.tomcat.Tomcat

fun main(args: Array<String>) {
    embeddedServer(Tomcat, 8080) {
        routing {
            get("/") {
                call.respondText("My Example Blog", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}