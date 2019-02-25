package net.acmicpc.completed

import java.io.*
import java.util.*

fun Array<Boolean>.isAllTrue(): Boolean {
    for (bool in this)
        if (!bool)
            return false
    return true
}

fun Array<Boolean>.getFirst(): Int {
    for (bool in this)
        if (!bool)
            return this.indexOf(bool)
    return -1
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val n = reader.readLine().toInt()
    val status = Array(n){ false }
    val picked = LinkedList<Int>()

    fun LinkedList<Int>.print(): Unit {
        for (int in this)
            writer.write("${int + 1} ")
        writer.write("\n")
    }


    fun pick(n: Int, status: Array<Boolean>, picked: LinkedList<Int>): Unit {
        if (status.isAllTrue()) {
            picked.print()
            return
        }

        val smallest = if (picked.isEmpty()) 0 else status.getFirst()

        for (next in smallest until n) {
            if (!status[next]) {
                picked.addLast(next)
                status[next] = true
                pick(n, status, picked)
                picked.removeLast()
                status[next] = false
            }
        }
    }

    pick(n, status, picked)

    writer.flush()
    writer.close()
}