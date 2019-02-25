package net.acmicpc.completed

import java.io.*
import java.util.*

fun isPrime(n: Int): Boolean {
    if (n == 0 || n == 1) return false
    if (n == 2) return true
    for (i in 2 until n)
        if (n % i == 0)
            return false
    return true
}

fun main() {
    fun LinkedList<Int>.toInt(): Int {
        var result = 0

        for (i in 0 until this.size) {
            result += this[i] * Math.pow(10.toDouble(), i.toDouble()).toInt()
        }
        return result
    }

    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    fun primeMaker(primes: LinkedList<Int>, toPick: Int): Unit {
        if (toPick == 0) {
            writer.write("${primes.toInt()}\n")
            return
        }

        for (i in 1..9) {
            primes.addFirst(i)
            if (primes.isEmpty() || isPrime(primes.toInt()))
                primeMaker(primes, toPick - 1)
            primes.removeFirst()
        }
    }

    // main
    val input = reader.readLine().toInt()
    val primes = LinkedList<Int>()

    primeMaker(primes, input)
    // end

    writer.flush()
    writer.close()
}