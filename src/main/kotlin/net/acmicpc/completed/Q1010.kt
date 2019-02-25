package net.acmicpc.completed

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    val arr = Array(30){ Array(30){ -1 } }
    // main

    fun solve(n: Int, k: Int): Int {
        if (n == 0 || n == k || k == 0) return 1
        if (arr[n][k] != -1) return arr[n][k]

        arr[n][k] = solve(n - 1, k) + solve(n - 1, k - 1)
        return arr[n][k]
    }

    var t = readLine().toInt()
    while(t-- > 0) {
        val input = readLine().split(" ")
        writer.write("${solve(input[1].toInt(), input[0].toInt())}\n")
    }


    // end

    writer.flush()
    writer.close()
}