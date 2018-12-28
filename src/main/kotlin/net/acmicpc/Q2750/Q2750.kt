package net.acmicpc.Q2750

import java.util.*

fun swap(a: IntArray, i1: Int, i2: Int): Unit {
    val tmp = a[i1]
    a[i1] = a[i2]
    a[i2] = tmp
}

fun quickSort(a: IntArray, left: Int, right: Int): Unit {
    var pl = left
    var pr = right
    val x = a[(pl + pr) / 2]

    do {
        while (a[pl] < x) pl++
        while (a[pr] > x) pr--
        if(pl <= pr)
            swap(a, pl++, pr--)
    } while (pl <= pr)

    if (left < pr) quickSort(a, left, pr)
    if (pl < right) quickSort(a, pl, right)
}

fun main(args: Array<String>) {
    val stdIn = Scanner(System.`in`)
    var nx = stdIn.nextInt()
    val x = IntArray(nx)

    for (i in 0..(nx-1)) {
        x[i] = stdIn.nextInt()
    }

    quickSort(x, 0, --nx)

    x.forEach { println(it) }
}