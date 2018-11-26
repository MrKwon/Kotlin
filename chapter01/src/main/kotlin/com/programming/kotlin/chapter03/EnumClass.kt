package com.programming.kotlin.chapter03

// basic enum type
enum class Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

// Constructor Params 를 가지는 enum type
/*public*/ enum class Plannet(val mass: Double, val radius: Double) {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);
}

fun main(args: Array<String>) {
    val today = Day.valueOf("MONDAY")
    val earth = Plannet.valueOf("EARTH")

    println(Day.values())
    println(Plannet.values())

    println("today is ${today}")
    println("here is ${earth}")
}