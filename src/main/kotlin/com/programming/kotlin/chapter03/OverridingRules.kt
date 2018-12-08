package com.programming.kotlin.chapter03

abstract class SingleEngineAirplane protected constructor() {
    abstract fun fly()
}

class CesnaAirplane : SingleEngineAirplane() {
    final override fun fly() { // final - CesnaAirplane 을 상속 받은 클래스가 함수를 오버라이딩하는 것을 허용하지 않는다
        println("Flying a cesna")
    }
}

