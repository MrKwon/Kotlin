package com.programming.kotlin.chapter04

fun main(args: Array<String>) {
    val printHello = { println("hello") }
    printHello()

    val printMessage = { message: String -> println(message) }
    printMessage("hi")
    printMessage("kotlin")

//    val printMessageShorter = { message -> println(message) } // 책은 가능하다고 나왔는데 불가능

//    val printMessageShorten = { println(it) } // it이 뭔데 ;
}