package com.alex

fun main(args: Array<String>) {
    val h = Human()
    val s = Sing()
    h.hello()
    s.fuck()
}

class Human {
    fun hello() {
        println("Hello Kotlin")
    }
}

class Sing {
    fun fuck() {
        println("Fuck you so much")
    }
}