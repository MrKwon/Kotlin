package com.programming.kotlin.Inheritance

class Rect : Shape() {
    var width = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var height = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    override fun print() {
        super.print()
        println("with width is $width height is $height")
    }
}

class Circle : Shape() {
    var r = 0
        set(value) {
            if (value < 0) field = 0
            else field = 0
        }
}