package net.acmicpc

import kotlin.math.max
import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    val tmpArr = readLine()!!.split(" ")
    val arr = Array(n){ i -> tmpArr[i].toInt() }

    // arr[left..right] 구간에서 찾아낼 수 있는 가장 큰 원소의 합을 반환
    fun solve(left: Int, right: Int): Long {
        // 기저 사례 : 배열의 원소가 하나인 경우
        if (left == right)
            return arr[left].toLong() * arr[left].toLong()

        val mid = (left + right) / 2
        var result = max(solve(left, mid), solve(mid + 1, right))

        var lo = mid
        var hi = mid
        var min = arr[mid]
        var sum = arr[mid].toLong()

        result = max(result, sum * min)

        while (left < lo || hi < right) {
            if (hi < right && (lo == left || arr[lo - 1] < arr[hi + 1])) {
                ++hi
                min = min(min, arr[hi])
                sum += arr[hi]
            } else {
                --lo
                min = min(min, arr[lo])
                sum += arr[lo]
            }

            result = max(result, sum * min)
        }
        return result
    }

    // end
    println("${solve(0, arr.size - 1)}")
}