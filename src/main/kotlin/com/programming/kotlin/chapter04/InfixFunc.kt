package com.programming.kotlin.chapter04

class Account {
    var balance = 0.0

    infix fun add(amount: Double): Unit {
        this.balance = balance + amount
    }

//    fun add(amount: Double): Unit { // infix만으로 오버라이딩은 불가능하다
//        this.balance = balance + amount
//    }
}

fun main(args: Array<String>) {
    var myAccount = Account()

    myAccount add 100.0

    println(myAccount.balance)
}