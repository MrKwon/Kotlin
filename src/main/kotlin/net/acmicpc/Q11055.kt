package net.acmicpc

import java.io.*
import java.util.*
import kotlin.math.max

fun main() = with(Scanner(System.`in`)) {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))

    // main
    val n = nextInt()
    val arr = Array(n){ nextInt() }.toCollection(LinkedList())
    val cache = Array(1000){ -1 }
//    val cache2 = Array(1001){ -1 }

//    fun solve(A: LinkedList<Int>): Int {
//        // 기저 사례 : A가 비어있을 때, 증가하는 부분 수열의 합은 무조건 0
//        if (A.isEmpty()) return 0
//        var ret = 0
//        for (i in 0 until A.size) {
//            val B = LinkedList<Int>()
//            for (j in i + 1 until A.size)
//                if (A[i] < A[j])
//                    B.addLast(A[j])
//            ret = max(ret, A[i] + solve(B)) // B는 A[i] 뒤에 있는 증가하는 부분 수열
//
//        }
//        return ret
//    }

    fun solve1(start: Int): Int {
        var ret = cache[start]
        if (ret != -1) return ret
        // 항상 S[start]는 있기 때문에 합은 자기 자신
        ret = arr[start]
        for (next in start + 1 until n)
            if (arr[start] < arr[next])
                ret = max(ret, solve1(next) + arr[start])
        return ret
    }

//    fun solve2(start: Int):
    // end

//    writer.write("${solve(arr)}\n")

    var max = 0
    for (i in 0 until n) {
        max = max(max, solve1(i))
    }

    writer.write("$max")

    writer.flush()
    writer.close()
}