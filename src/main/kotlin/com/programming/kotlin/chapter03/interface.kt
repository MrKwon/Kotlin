package com.programming.kotlin.chapter03

import java.io.InputStream
import java.io.OutputStream

interface Document {
    val version: Long
    val size: Long

    val name: String
    get() = "NoName"

    fun save(input: InputStream)
    fun load(stream: OutputStream)
    // java의 default method 격, interface 이지만 구현체를 가지고 있다.
    fun getDescription(): String { return "Document $name has $size byte(-s)"}
}

class DocumentImpl : Document {
    override val size: Long
        get() = 0

    override fun load(stream: OutputStream) {
    }

    override fun save(input: InputStream) {
    }

    override val version: Long
        get() = 0

    override fun getDescription(): String {
        return super.getDescription()
    }
}
