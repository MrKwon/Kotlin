package com.programming.kotlin.Classes

data class Node<T>(/*var index: Int, */var data: T)

class Stack<T>() {
    private var stack: Array<Node<T>?>
    public var size = 10 // default size is 10
        set(value) {
            field = value
            stack = Array(value){ null }
        }

    init {
        stack = Array(size){ null }
        println("init ${stack.size}")
    }

    constructor(size: Int) : this() {
        this.size = size
        stack = Array(size){ null }
    }


    fun size(): Int {
        return size
    }

    fun isEmpty(): Boolean {
        return this.size() == 0
    }

    fun push(element: T): Boolean {
        if (size == stack.size) return false

        val tmp = Node(element)
        stack[size] = tmp
        size++
        return true
    }

    fun pop(): T? {
        if (this.isEmpty()) return null

        val tmp = stack[size]
        stack[size] = null
        size--
        return tmp!!.data
    }

    fun peek(): T {
        return stack[size]!!.data
    }


}