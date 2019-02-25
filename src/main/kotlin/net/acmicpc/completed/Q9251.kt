package net.acmicpc.completed

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    // main
    val str1 = readLine().toCharArray()
    val str2 = readLine().toCharArray()

    fun solve(a: CharArray, b: CharArray): Int {
        val cache = Array(a.size + 1){ Array(b.size + 1){ 0 } }
        var result = Int.MIN_VALUE

        for (i in 1..a.size) {
            for (j in 1..b.size) {
                if (a[i - 1] == b[j - 1])
                    cache[i][j] = cache[i - 1][j - 1] + 1
                else
                    cache[i][j] = max(cache[i - 1][j], cache[i][j - 1])

                result = max(result, cache[i][j])
            }
        }

        return result
    }

    writer.write("${solve(str1, str2)}")
    // end

    writer.flush()
    writer.close()
}