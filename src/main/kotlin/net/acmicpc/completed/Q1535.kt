package net.acmicpc.completed

import java.io.*

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    // main
    val n = reader.readLine().toInt()

    if (n != 0) {
        val tmpL = reader.readLine().split(" ")
        val L = Array(n) { i -> tmpL[i].toInt() }
        val tmpJ = reader.readLine().split(" ")
        val J = Array(n) { i -> tmpJ[i].toInt() }

        fun maxHappy(currLife: Int, currJoy: Int, index: Int): Int {
            // 기저 사례 : 배열의 범위를 벗어나는 경우
            if (index >= n) return currJoy
            // 기저 사례1 : 다음 인사를 했을 때 체력이 0보다 작거나 같으면 안되므로 현재 joy를 반환
            if (currLife - L[index] <= 0) return currJoy

            val nextLife = currLife - L[index]
            val nextJoy = currJoy + J[index]
            return maxHappy(nextLife, nextJoy, index + 1)
        }

        writer.write("${maxHappy(100, 0, 0)}")
    }

    if (n == 0) writer.write("0")
    writer.flush()
    writer.close()
}