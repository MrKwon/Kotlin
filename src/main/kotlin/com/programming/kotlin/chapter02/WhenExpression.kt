package com.programming.kotlin.chapter02


// 인자가 있는 when 문은 switch-case 문과 같이 쓰일 수 있음
fun whatNumber(x: Int) : Unit {
    when (x) {
        0 -> println("x is zero")
        1 -> println("x is 1")
        else -> println("x is neither 0 nor 1")
    }
}

fun isMinOrMax(x: Int) : Boolean {
    val isZero: Boolean = when (x) {
        Int.MIN_VALUE -> true
        Int.MAX_VALUE -> true
        else -> false
    }

    return isZero
}

fun isZeroOrOne(x: Int) : Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

fun isAbs(x: Int): Boolean {
    return when (x) {
        Math.abs(x) -> true
        else -> false
    }
}

fun isSingleDigit(x: Int): Boolean {
    return when (x) {
        in -9..9 -> true
        else -> false
    }
}

fun isDieNumber(x: Int): Boolean {
    return when (x) {
        in listOf(1, 2, 3, 4, 5, 6) -> true
        else -> false
    }
}

fun startsWithFoo(any: Any): Boolean {
    return when (any) {
        is String -> any.startsWith("Foo")
        else -> false
    }
}

// 인자가 없는 when문은 if 문 대신 사용할 수 있음
fun whenWithoutArgs(x: Int, y: Int): Unit {
    when {
        x < y -> println("x is less than y")
        x > y -> println("is greater than y")
        else -> println("x must equal y")
    }
}