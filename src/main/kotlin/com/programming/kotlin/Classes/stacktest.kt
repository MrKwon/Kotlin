package com.programming.kotlin.Classes

fun main() {
    val stackWithDefault = Stack<Int>()
    println(stackWithDefault.size)
    stackWithDefault.size = 100
    println(stackWithDefault.size)


    val stackWithSize = Stack<Int>(100)
}