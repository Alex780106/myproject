package com.alex

import javafx.scene.text.FontWeight

fun main(args: Array<String>) {
    val h = Human(66.5f,1.7f)
   println( h.bmi())
   /* val s = Sing()
    h.hello()
    s.fuck()
    //var //變數*/

    var age: Int = 19;
    var name: String
    name = "Alex"
    //age = 20; 會出現錯誤的 不能夠reassigned


}

class Human(var  weight: Float,var height:Float) {
    fun bmi () :Float {
        val bmi = weight /(height * height)
        return bmi
    }
    fun hello() {
        println("Hello Kotlin")
    }
}

