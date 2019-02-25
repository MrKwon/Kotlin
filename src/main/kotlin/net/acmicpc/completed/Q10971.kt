package net.acmicpc.completed

import java.io.*
import java.util.*
import kotlin.math.min

const val MAX = 10

/**
 * 전부 연결되어 있다고 가정하고 있어서 잘못됨
 */
fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val dist = Array(MAX){ Array(MAX){ 0 } } // 두 도시 간의 거리

    // main
    val n = reader.readLine().toInt()
    for (i in 0 until n) {
        val input = reader.readLine().split("""([ ]+)""".toRegex())
        for (j in 0 until n)
            dist[i][j] = input[j].toInt()
    }

    fun shortestPath(path: LinkedList<Int>, visited: Array<Boolean>, currentLength: Int): Int {
        // 기저 사례: 모든 도시들을 다 방문한 경우 시작 도시로 돌아가고 종료한다.
        if (path.size == n)
            return currentLength + dist[path.last()][path[0]]

        var result = Int.MAX_VALUE

        for (next in 0 until n) {
            if (visited[next]) continue
            val here = if (path.isEmpty()) next else path.last()
            println("$here is here, $next is next")
            path.addLast(next)
            visited[next] = true
            // 나머지 경로를 재귀로 완성시키고 가장 짧은 경로의 길이를 얻는다
            val cand = shortestPath(path, visited, currentLength + dist[here][next])
            result = min(result, cand)
            visited[next] = false
            path.removeLast()
        }

        return result
    }

    val path = LinkedList<Int>()
    val visited = Array(n){ false }
    writer.write(shortestPath(path, visited, 0).toString())

    // end

    writer.flush()
    writer.close()
}