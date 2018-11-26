package com.programming.kotlin.chapter03

class Person constructor(val firstName: String, val lastName: String, val age: Int?) {
    init {
        require(firstName.trim().length > 0) { "Invalid firstName argument." }
        require(lastName.trim().length > 0) { "Invalid lastName argument." }
        if (age != null) {
            require(age >= 0 && age < 150) {"Invalid age argument." }
        }
    }

    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}

class Person2(firstName: String, lastName: String, howOld: Int?) {
    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName, $lastName"
        this.age = howOld
    }

    fun getName(): String = this.name

    fun getAge(): Int? = this.age
}

fun main(args: Array<String>) {
    val person_1 = Person("Alex", "Smith", 29)
    val person_2 = Person("Jane", "Smith")

    println("${person_1.firstName}, ${person_1.lastName} is ${person_1.age} years old")
    println("${person_2.firstName}, ${person_2.lastName} is ${person_2.age.toString()?: "?"} years old")

    val person2_1 = Person2("Fredy", "Mercury", 45)
    println("${person2_1.getName()} is ${person2_1.getAge().toString()?: "?"} years old")
}