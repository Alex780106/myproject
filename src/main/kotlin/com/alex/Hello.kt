package com.alex

fun main(args: Array<String>) {
    Human().hello()
    val age : Int = 19 //指定資料型態

    var age1 = 19
    age1 = 20
    var weight = 66.5f
    var name : String;
    name = "Hank"

}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}
