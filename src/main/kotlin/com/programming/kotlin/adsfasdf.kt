package com.programming.kotlin

//fun parseInt(str: String): Int? {
//    try {
//        return str.toInt()
//    } catch (e: NumberFormatException) {
//        return null
//    }
//}
//
//
//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // x나 y가 null일 수도 있기 때문에 x * y 연산을 사용하는 것이 에러를 넘겨줄 수 있다.
//    if (x != null && y != null) {
//        // x 와 y 가 null 확인을 한 후 자동적으로 not-nullable로 캐스트(cast)된다.
//        println(x * y)
//    } else {
//        println("'$arg1' 혹은 '$arg2' 는 number 가 아니다.")
//    }
//}

fun main(args: Array<String>) {
    for (x in 1..10 step 2) {
        print(x)
    }
}
