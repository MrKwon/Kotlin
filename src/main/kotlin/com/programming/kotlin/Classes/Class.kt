package com.programming.kotlin.Classes

class Student() {
    var name = ""
    var age = 0

    constructor(name: String) : this() {
        this.name = name
    }
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    fun name(): String = "My name is ${this.name}"

    fun age(): String = "My age is ${this.age}"

    fun nameAndAge(): String = "My name is ${this.name} and I'm ${this.age} years old"
}

open class Person(name: String, age: Int?) {
    var personName = name
    var personAge = age

    constructor(name: String) : this(name, null) {
        personName = name
        personAge = null
    }
}
class User() {
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
}

class Programmer(name: String, language: String?, age: Int?) : Person(name, age) {
    var language = language
//    constructor(name: String) : this(name, null, null) {
//        super(name)
//    }

}

fun main() {
    val student01 = Student()
    println(student01.nameAndAge())
    student01.name = "Jason Kwon"
    println(student01.nameAndAge())
    student01.age = 27
    println(student01.nameAndAge())

//    val programmer = Programmer()
//    println("is lazy run?")
//    programmer.language = "JavaScript"
//
//    println(programmer.name)
//    println(programmer.printTry())


}