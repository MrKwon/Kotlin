package com.programming.kotlin.chapter04

fun main(args: Array<String>) {
    val ints = arrayOf(1, 2, 3, 4)

    val a = 3 in ints
    println(a)

    val b = ints.contains(3)
    println(b)

    val c = 5 !in ints
    println(c)

    val d = !ints.contains(5)
    println(d)
}