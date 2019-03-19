package com.alex

fun main(args: Array<String>) {
    val h = Human()
    val s = Sing()
    h.hello()
    s.fuck()
    //var //變數
    var age : Int = 19;
    var name :String
    name = "Alex"
    //age = 20; 會出現錯誤的 不能夠reassigned


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