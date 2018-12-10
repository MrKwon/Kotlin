package com.programming.kotlin.chapter05

fun modulo(k: Int): (Int) -> Boolean = { it % 2 == k }

fun main(args: Array<String>) {

    val ints = listOf<Int>(1, 2, 3, 4, 5, 6)

    val evens = mutableListOf<Int>()
    val odds = mutableListOf<Int>()
    for (k in ints) {
        if (k % 2 == 0)
            evens.add(k)
        else
            odds.add(k)
    }

    println(evens)
    println(odds)

    val oddsHF = ints.filter { it % 2 == 1 }
    val evensHF = ints.filter { it % 2 == 0 }

    println(evensHF)
    println(oddsHF)

    val oddsModulo = ints.filter(modulo(1))
    val evensModulo = ints.filter(modulo(0))

    println(evensModulo)
    println(oddsModulo)

    val isEven: (Int) -> Boolean = modulo(0)
//    val isEven01: (Int) -> Boolean = { it % 2 == 0 }
//    val isEven02 = { k: Int -> k % 2 == 0 }
    val isOdd: (Int) -> Boolean = modulo(1)

    val oddsModuloAssign = ints.filter(isEven)
    val evensModuloAssign = ints.filter(isOdd)

    println(evensModuloAssign)
    println(oddsModuloAssign)

    println(listOf(1, 2, 3, 4).filter(isEven))
    println(listOf(5, 6, 7, 8).filter(isOdd))


}