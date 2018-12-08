package com.programming.kotlin.chapter04

class Submarine {
    fun fire(): Unit {
        println("Firing torpedoes")
    }

    fun submerge(): Unit {
        println("Submerging")
    }
}

fun Submarine.fire(): Unit { // 절대 호출될 수 없다.
    println("Fire on board!")
}

fun Submarine.submerge(depth: Int): Unit {
    println("Submerging to a depth of $depth fathoms")
}

fun Any?.safeEquals(other: Any?): Boolean {

    fun thisNull() : Boolean = this == null
    fun otherNull() : Boolean = other == null

    when {
        thisNull() && otherNull() -> return true
        thisNull() -> return false
    }

    return this!!.equals(other)
}

fun main(args: Array<String>) {
    val sub = Submarine()
    sub.fire()
    sub.submerge()
    sub.submerge(10)

    val str1: String = "man"
    val str2: String = "man"
    val str3: String = "woman"
    var str4: String? = null

    println( "equal string " + str1.safeEquals(str2) )
    println( "different string " + str2.safeEquals(str3) )
    println( "safe equal " + str3.safeEquals(str4))
    println( "un safe equal " + str3.equals(str4) )
}