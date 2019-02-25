package net.acmicpc.completed

import java.io.*
import java.util.*

fun main() {

    fun LinkedList<Int>.toInt(): Int {
        var result = 0
        for (i in 0 until this.size - 1) {
            result += this[i] * Math.pow(10.toDouble(), i.toDouble()).toInt()
        }
        return result
    }

    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val nums = arrayOf(4, 7)
    val array = ArrayList<Int>()

    fun makeNum(input: Int, output: LinkedList<Int>): Unit {
        val tmp = output.toInt()
        if (tmp <= input && !array.contains(tmp))
            array.add(tmp)

        if (input <= tmp) {
            return
        }

        for (i in 0 until 2) {
            output.addFirst(nums[i])
            makeNum(input, output)
            output.removeFirst()
        }
    }
    val input = reader.readLine().toInt()
    val output = LinkedList<Int>()
    makeNum(input, output)

    array.sort()

    writer.write("${array.last()}")
    writer.flush()
    writer.close()
}