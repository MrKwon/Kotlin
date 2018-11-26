package com.programming.kotlin.chapter01

fun main(args: Array<String>) {
    println("Hello World!")

    val student = Student("Alexandra Miller")
    println("Student name: ${student.name}")

    val carManufacturer = CarManufacturer("Mercedes")
    println("Car manufacturer: ${carManufacturer.name}")
}