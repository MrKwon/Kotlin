package com.programming.kotlin.chapter03

class BasicGraph(val name: String) {
    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2:$y2)")
        }
    }

    fun draw() {
        println("Drawing the graph $name")
    }
}

class BasicGraphWithInner(graphName: String) {
    private val name: String

    init {
        name = graphName
    }

    inner class InnerLine(val x1: Int, val x2: Int, val y1: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2:$y2) for graph $name")
        }
    }

    fun draw() {
        println("Drawing the graph $name")
    }
}

fun main(args: Array<String>) {
    val line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()

    val lineInner = BasicGraphWithInner("graph")
    lineInner.draw()
    lineInner.InnerLine(1, 0, -2, 0).draw()
}