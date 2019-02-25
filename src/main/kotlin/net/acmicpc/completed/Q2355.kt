package net.acmicpc.completed

import java.io.*
import kotlin.math.abs

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val inputs = reader.readLine().split(" ")
    val start = inputs[0].toLong()
    val end = inputs[1].toLong()
    val mid: Double = (start + end) / 2.0

    writer.write("${(mid * (abs(end - start) + 1)).toLong()}")
    writer.flush()
    writer.close()
}