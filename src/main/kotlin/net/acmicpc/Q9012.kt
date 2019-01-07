package net.acmicpc

import java.util.*

fun main(args: Array<String>) {
    val stdIn = Scanner(System.`in`)
    val inputs = stdIn.nextInt()
    val stack = Stack<String>()

    for (i in 0 until inputs) {
        val string = stdIn.next()
        val char = string.split("")

        for (j in 0 until char.size) {
            if (stack.size == 0 && char[j] == "(") stack.push(char[j])
            else if (stack.size == 0 && char[j] == ")"){
                println("inside NO")
                break
            }
            else if (stack.peek() == char[j]) stack.push(char[j])
            else if (stack.peek() == "(" && char[j] == ")") stack.pop()

            if(j == char.size)
                when(stack.isEmpty()) {
                    true -> println("YES")
                    false -> println("NO")
                }
        }

        stack.clear()
    }
}