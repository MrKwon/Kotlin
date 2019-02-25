package net.acmicpc.completed

import java.io.*
import java.util.*

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.`out`))
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val LC = reader.readLine().split(" ")
    val inputs = reader.readLine().split(" ")
    val chars = Array(LC[1].toInt()){ i -> inputs[i] }
    chars.sort()

    fun LinkedList<Int>.print(): Unit {
        for (i in this)
            writer.write(chars[i])
        writer.write("\n")
    }

    fun isSatisfy(list: LinkedList<Int>): Boolean {
        var aeiou = 0
        var others = 0

        for (i in list) {
            if (chars[i] == "a"
                || chars[i] == "e"
                || chars[i] == "i"
                || chars[i] == "o"
                || chars[i] == "u")
                aeiou += 1
            else
                others += 1
        }

        return (aeiou >= 1 && others >= 2)
    }

    fun pick(picked: LinkedList<Int>, toPick: Int): Unit {
        if (toPick == 0) {
            when { isSatisfy(picked) -> picked.print() }
            return
        }

        val smallest = if (picked.isEmpty()) 0 else picked.last + 1

        for (next in smallest until LC[1].toInt()) {
            picked.addLast(next)
            pick(picked, toPick - 1)
            picked.removeLast()
        }
    }

    val picked = LinkedList<Int>()
    pick(picked, LC[0].toInt())

    writer.flush()
    writer.close()
}