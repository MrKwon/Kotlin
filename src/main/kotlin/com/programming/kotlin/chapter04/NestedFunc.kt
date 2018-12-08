package com.programming.kotlin.chapter04

fun fizzbuzz(start: Int, end: Int): Unit { // Unit 은 void 격
    for (k in start..end) {
        if (k % 3 == 0 && k % 5 == 0)
            println("Fizz Buzz")
        else if (k % 3 == 0)
            println("Fizz")
        else if (k % 5 == 0)
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz2(start: Int, end: Int): Unit {

    fun isFizz(k: Int): Boolean = k % 3 == 0
    fun isBuzz(k: Int): Boolean = k % 5 == 0

    for (k in start..end) {
        if(isFizz(k) && isBuzz(k))
            println("Fizz Buzz")
        else if (isFizz(k))
            println("Fizz")
        else if (isBuzz(k))
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz3(start: Int, end: Int): Unit {
    for (k in start..end) {

        fun isFizz(): Boolean = k % 3 == 0
        fun isBuzz(): Boolean = k % 5 == 0

        if (isFizz() && isBuzz())
            println("Fizz Buzz")
        else if (isFizz())
            println("Fizz")
        else if (isBuzz())
            println("Buzz")
        else
            println(k)

    }
}

fun fizzbuzz4(start: Int, end: Int): Unit {
    for (k in start..end) {

        fun isFizz(): Boolean = k % 3 == 0
        fun isBuzz(): Boolean = k % 5 == 0

        when {
            isFizz() && isBuzz() -> println("Fizz Buzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> println(k)
        }
    }
}

fun main(args: Array<String>) {
    println("using named parameter")
    fizzbuzz4(end= 5, start= 3)

    println("using positional param")
    fizzbuzz4(3, 5)

}