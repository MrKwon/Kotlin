package com.programming.kotlin.chapter06

class Student(name: String, age: Int) {
    constructor(name: String, age: Int, address: String) : this(name, age) {
        Address = address
    }

    lateinit var Name: String

    public var Age = 20
    set(value) { field = value }

    public var Address: String? = ""
    set(value) { field = value }

    init {
        Age = age
        Address = null
    }

    fun addAge(other: Student): Unit {
        this.Age += other.Age
    }
}