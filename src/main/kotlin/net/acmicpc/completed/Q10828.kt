package net.acmicpc.completed

import java.util.*

/**
 * 코드 양은 자바에 비해 줄었으나 너무 느림 420ms
 * 이것도 java와 마찬가지로 Scanner를 없애고 println을 없애면 속도가 줄어들 것 같은데
 * 아직 kotlin에 대해 자세히 아는 내용이 없어서
 */
fun main(args: Array<String>) {
    val stdIn = Scanner(System.`in`)
    val stack = Stack<Int>()

    val inputs = stdIn.nextInt()

    for (i in 0 until inputs) {
        val command: String = stdIn.next()

        when(command) {
            "push" -> stack.push(stdIn.nextInt())
            "pop"-> {
                when(stack.size) {
                    0 -> println(-1)
                    else -> println(stack.pop())
                }
            }
            "size" -> println(stack.size)
            "empty" -> println(if (stack.empty()) 1 else 0)
            "top" -> {
                when(stack.size) {
                    0 -> println(-1)
                    else -> println(stack.peek())
                }
            }
        }
    }
}