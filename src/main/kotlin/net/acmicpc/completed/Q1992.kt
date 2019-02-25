package net.acmicpc.completed

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()
    val array = Array(n){ readLine() }

    fun solve(y: Int, x: Int, size: Int): String {
        if (size == 1)
            return array[y][x].toString()

        val half = size / 2

        val lu = solve(y, x, half)
        val ru = solve(y, x + half, half)
        val ld = solve(y + half, x, half)
        val rd = solve(y + half, x + half, half)

        return if (lu == ru && ru == ld && ld == rd)
            "$lu"
        else
            return "($lu$ru$ld$rd)"
    }

    writer.write(solve(0, 0, n))
    writer.flush()
    writer.close()
}