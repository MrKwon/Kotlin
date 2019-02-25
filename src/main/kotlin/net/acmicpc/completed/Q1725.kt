package net.acmicpc.completed

import kotlin.math.max
import kotlin.math.min

fun Array<Int>.solve(left: Int, right: Int): Int {
    // 기저 사례 1: input 배열이 하나인 경우
    if (left == right) return this[left]
    // 어느 한쪽에만 있는 경우
    val mid = (left + right) / 2
    var result = max(solve(left, mid), solve(mid + 1, right))
    // 양쪽에 걸쳐 있는 경우
    var lo = mid
    var hi = mid + 1
    var height = min(this[lo], this[hi])
    result = max(result, 2 * height)
    while (left < lo || hi < right) { // 범위 내에 있는 경우 계속 반복
        if (hi < right && (left == lo || this[lo - 1] < this[hi + 1])) {
            hi++
            height = min(height, this[hi])
        } else {
            lo--
            height = min(height, this[lo])
        }
        result = max(result, height * (hi - lo + 1))
    }
    return result
}


fun main() {
    val n = readLine()!!.toInt()
    val hist = Array(n){ readLine()!!.toInt() }

    println("${hist.solve(0, hist.size - 1)}")
}