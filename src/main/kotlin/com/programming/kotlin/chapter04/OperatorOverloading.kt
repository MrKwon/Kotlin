package com.programming.kotlin.chapter04

class Matrix(val a: Int, val b: Int, val c: Int, val d: Int) {
    operator fun plus(matrix: Matrix): Matrix {
        return Matrix(a + matrix.a, b + matrix.b, c + matrix.c, d + matrix.d)
    }

    fun printMatrix(): Unit {
        println("[ ${this.a}  ${this.b} ]")
        println("[ ${this.c}  ${this.d} ]")
        println()
    }
}

fun main(args: Array<String>) {
    val m1 = Matrix(1, 2, 3, 4)
    m1.printMatrix()

    val m2 = Matrix(4, 3, 2, 1)
    m2.printMatrix()

    val m3 = m1 + m2 // operator overloading
    m3.printMatrix()

    val m4 = m1.plus(m2)
    m4.printMatrix()
}