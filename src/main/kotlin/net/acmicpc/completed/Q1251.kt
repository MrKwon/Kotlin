package net.acmicpc.completed

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    // main
    val n = readLine()
    val f = readLine().toInt()

    fun solution(n: String, f: Int): String {
        val tmp = when (n.length > 2) {
            true -> "${n.subSequence(0, n.length - 2)}00".toInt()
            false -> n.toInt()
        } % f

        var result = 0

        for (i in 0 until f)
            if (i + tmp == f)
                result = i

        return String.format("%02d", result)
    }

    println(solution(n, f))
    // end

    writer.flush()
    writer.close()
}