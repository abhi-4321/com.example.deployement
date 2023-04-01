package com.example.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import kotlinx.html.body

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "\t<title>Welcome to My Website</title>\n" +
                    "\t<style>\n" +
                    "\t\t/* Customize the style of the header */\n" +
                    "\t\theader {\n" +
                    "\t\t\tbackground-color: #333;\n" +
                    "\t\t\tcolor: #fff;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t\tpadding: 20px;\n" +
                    "\t\t\tfont-size: 36px;\n" +
                    "\t\t}\n" +
                    "\n" +
                    "\t\t/* Customize the style of the links */\n" +
                    "\t\tnav a {\n" +
                    "\t\t\tdisplay: block;\n" +
                    "\t\t\tpadding: 10px;\n" +
                    "\t\t\tfont-size: 20px;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t\tcolor: #333;\n" +
                    "\t\t\tbackground-color: #eee;\n" +
                    "\t\t\tborder: 1px solid #ccc;\n" +
                    "\t\t\tmargin-bottom: 10px;\n" +
                    "\t\t\ttext-decoration: none;\n" +
                    "\t\t}\n" +
                    "\n" +
                    "\t\t/* Customize the style of the appbar */\n" +
                    "\t\tfooter {\n" +
                    "\t\t\tbackground-color: #333;\n" +
                    "\t\t\tcolor: #fff;\n" +
                    "\t\t\ttext-align: center;\n" +
                    "\t\t\tpadding: 20px;\n" +
                    "\t\t\tfont-size: 18px;\n" +
                    "\t\t}\n" +
                    "\t</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\t<header>\n" +
                    "\t\t<h1>One Language to Rule Them All: How Kotlin Streamlines Web Development?</h1>\n" +
                    "\t</header>\n" +
                    "\n" +
                    "\t<p>Let's Explore</p>\n" +
                    "\n" +
                    "\t<nav>\n" +
                    "\t\t<a href=\"/1\">Api in less than 7 mins</a>\n" +
                    "\t\t<a href=\"/2\">Try CLicking here too</a>\n" +
                    "\t\t<a href=\"/3\">Thank you</a>\n" +
                    "\t</nav>\n" +
                    "\n" +
                    "\t<footer>\n" +
                    "\t\t<p>Thank you for visiting ! - Kailash Sharma</p>\n" +
                    "\t</footer>\n" +
                    "</body>\n" +
                    "</html>\n", ContentType.Text.Html)


        }
        get("/1"){
            call.respond("Api in less than 5 mins")
        }
        get("/2"){
            call.respond("Simple isn't it")
        }
        get("/3"){
            call.respond("Thank you")
        }

    }
}
