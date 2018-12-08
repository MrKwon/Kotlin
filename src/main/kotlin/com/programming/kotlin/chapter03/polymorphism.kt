package com.programming.kotlin.chapter03

abstract class Shape protected constructor() {
    private var _xLocation: Int = 0
    private var _yLocation: Int = 0
    private var _width: Int = 0
    private var _height: Int = 0

    var XLocation: Int
        get() = this._xLocation
        set(value) {
            this._xLocation
        }

    var YLocation: Int
        get() = this._yLocation
        set(value) {
            this._yLocation
        }

    var Width: Int
        get() = this._width
        set(value) {
            this._width
        }

    var Height: Int
        get() = this._height
        set(value) {
            this._height
        }

    abstract fun isHit(x: Int, y: Int): Boolean
}

class Ellipsis : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        val xRadius = Width.toDouble() / 2
        val yRadius = Height.toDouble() / 2

        val centerX = XLocation + xRadius
        val centerY = YLocation + yRadius

        if (xRadius == 0.0 || yRadius == 0.0)
            return false

        val normalizedX = centerX - XLocation
        val normalizedY = centerY - YLocation

        return (normalizedX * normalizedX) / (xRadius + xRadius) + (normalizedY * normalizedY) / (yRadius * yRadius) <= 1.0
    }
}

class Rectangle : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        return x >= XLocation && x <= (XLocation + Width) && y >= YLocation && y <= YLocation + Height
    }
}

fun main(args: Array<String>) {
    val e1 = Ellipsis()
    e1.Height = 10
    e1.Width = 12

    val e2 = Ellipsis()
    e2.XLocation = 100
    e2.YLocation = 96
    e1.Height = 21
    e1.Width = 19

    val r1 = Rectangle()
    r1.XLocation = 49
    r1.YLocation = 45
    r1.Width = 10
    r1.Height = 10

    val shapes = listOf<Shape>(e1, e2, r1)

    // 아랫 부분 책에 있는 코드가 좀 이상한듯
    val selected:Shape? = shapes.firstOrNull { shape -> shape.isHit(50, 52) }
    if (selected == null) {
        println("There is no shape at point(50, 52)")
    }
    else {
        println("A shape of type ${selected.javaClass.simpleName} has been selected")
    }
}