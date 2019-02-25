package net.acmicpc.completed

import java.io.*

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    // main
    val inputs = reader.readLine().split(" ")

    fun pow(a: Int, b: Int, c: Int): Long {
        // 기저 사례 : b 가 1이면 그냥 한번 나눈 나머지
        when (b) { 0 -> return 1 }

        val n = pow(a, b / 2, c)
        val tmp = (n * n) % c

        return when (b % 2) {
            0 -> tmp
            else ->(a * tmp) % c
        }

    }

    writer.write("${pow( inputs[0].toInt(), inputs[1].toInt(), inputs[2].toInt())}")
    writer.flush()
    writer.close()
}