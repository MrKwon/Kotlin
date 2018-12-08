package com.programming.kotlin.chapter04

fun aMultiPrint(vararg strings: String): Unit {
    for (string in strings) {
        println(string)
    }
}

fun multiPrint(label: String, vararg strings: String): Unit {
    println(label)
    for (string in strings) {
        println(string)
    }
}

fun multiPrint(labelHead: String, vararg strings: String, labelTail: String): Unit {
    println(labelHead)
    for (string in strings) {
        println(string)
    }
    println(labelTail)
}

fun main(args: Array<String>) {
    aMultiPrint("a", "b", "c")
    multiPrint("Head", "A", "B", "C")
    multiPrint("Head", "a", "A", "b", "B", labelTail = "Tail")

    val arrString = arrayOf("Z", "Y", "X")
    multiPrint("spread", *arrString, labelTail = "oper")
}