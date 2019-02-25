package net.acmicpc.completed

import java.io.*
import java.util.*

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val inputs = Array(9){ reader.readLine().toInt() }
    inputs.sort()

    fun LinkedList<Int>.print(): Unit {
        for (int in this)
            writer.write("${inputs[int]}\n")
    }

    fun LinkedList<Int>.sum(): Int {
        var sum = 0
        for (i in this)
            sum += inputs[i]
        return sum
    }

    fun pick(picked: LinkedList<Int>, toPick: Int) {
        if (toPick == 0) {
            when { picked.sum() == 100 -> picked.print() }
            return
        }

        val smallest = if (picked.isEmpty()) 0 else picked.last + 1

        for (next in smallest until 9) {
            picked.addLast(next)
            pick(picked, toPick - 1)
            picked.removeLast()
        }
    }

    val picked = LinkedList<Int>()
    pick(picked, 7)

    writer.flush()
    writer.close()
}