package com.programming.kotlin.chapter03

class A {
    private val somefield: Int = 1000

    inner class B {
        private val somefield: Int = 10

        fun foo(s: String) {
            println("Field <somefield> from B : " + this.somefield)
            println("Field <somefield> from B : " + this@B.somefield)
            println("Field <somefield> from A : " + this@A.somefield)
        }
    }
}

fun main(args: Array<String>) {
    val ClassA = A()

    ClassA.B().foo("띠리띠리")
}