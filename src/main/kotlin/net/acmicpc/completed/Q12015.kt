package net.acmicpc.completed

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()
    val tmp = readLine().split(" ")
    val arr = Array(n){ i -> tmp[i].toInt() }

    fun index(arr: Array<Int>, l: Int, r: Int, key: Int): Int {
        var left = l
        var right = r

        while (right - left > 1) {
            val m = left + (right - left) / 2
            if (arr[m] >= key) right = m
            else left = m
        }

        return right
    }

    val cache = Array(n){ -1 }

    fun solve(arr: Array<Int>, size: Int): Int {
        var len = 1
        cache[0] = arr[0]

        for (i in 1 until size) {
            when {
                arr[i] < cache[0] -> cache[0] = arr[i]
                arr[i] > cache[len - 1] -> cache[len++] = arr[i]
                else -> cache[index(cache, -1, len - 1, arr[i])] = arr[i]
            }
        }

        return len
    }

    // main
    writer.write("${solve(arr, n)}")
    writer.flush()
    writer.close()
}