package com.programming.kotlin.Inheritance

open class Shape {
    var x = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var y = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    lateinit var name: String

    open fun print() {
        println("$name : location : $x, $y")
    }
}