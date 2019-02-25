package net.acmicpc.completed

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    // main
    val n = readLine().toInt()
    val tmp = readLine().split(" ")
    val arr = Array(n){ i -> tmp[i].toInt() }
    val dp = Array(n){ -1 }

    fun solve(size: Int): Int {
        // 기저 사례 : 원소가 하나인 배열은 그냥 그 원소 하나가 답
        if (size == 1) return arr.first()
        var max = 0

        for (i in 0 until size) {
            dp[i] = arr[i]
            for (j in 0 until i + 1) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i])
                    dp[i] = dp[j] + arr[i]
                max = max(max, dp[i])
            }

        }
        return max
    }

//  end
    writer.write("${solve(n)}")
    writer.flush()
    writer.close()
}

