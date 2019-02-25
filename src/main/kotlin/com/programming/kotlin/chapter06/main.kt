package com.programming.kotlin.chapter06

fun main() {
    val student = Student("권민철", 27, "강동구")

    println(student.Name)

    println("${student.Name} is ${student.Age} years old")
    student.addAge(student)
    println("${student.Name} is ${student.Age} years old")
}