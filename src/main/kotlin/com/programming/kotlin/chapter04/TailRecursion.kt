package com.programming.kotlin.chapter04

fun fact(k: Int): Int {
    if (k == 0) return 1
    else return k * fact(k - 1)
}

fun factRec(k: Int): Int {
    tailrec fun factTail(m: Int, n: Int): Int {
        if (m == 0) return n
        else return factTail(m - 1, m * n)
    }

    return factTail(k, 1)
}

fun main(args: Array<String>) {
    println(fact(10))
    println(factRec(10))
}