package net.acmicpc.completed

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    fun index(arr: Array<Int>, l: Int, r: Int, key: Int): Int {
        var tmpl = l
        var tmpr = r

        while (tmpr - tmpl > 1) {
            val m = tmpl + (tmpr - tmpl) / 2
            if (arr[m] >= key) tmpr = m
            else tmpl = m
        }

        return tmpr
    }

    fun solve(arr: Array<Int>, size: Int): Int {
        val tail = Array(size){ -1 }
        var len = 1
        tail[0] = arr[0]

        for (i in 1 until size) {
            when {
                arr[i] < tail[0] -> tail[0] = arr[i]
                arr[i] > tail[len - 1] -> tail[len++] = arr[i]
                else -> tail[index(tail, -1, len - 1, arr[i])] = arr[i]
            }
        }

        return len
    }

    // main
    val n = readLine().toInt()
    val tmp = readLine().split(" ")
    val arr = Array(n){ i -> tmp[i].toInt() }

    // end
    writer.write("${solve(arr, n)}")
    writer.flush()
    writer.close()
}