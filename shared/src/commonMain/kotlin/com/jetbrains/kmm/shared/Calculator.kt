package com.jetbrains.kmm.shared

class Calculator (private val generator: Generator) {
    companion object {
        fun sum(a: Int, b: Int): Int = a + b
    }

    fun foo(): String {
        return generator.gen()
    }
}

interface Generator {
    fun gen(): String
}

class DefaultGenerator : Generator {
    override fun gen(): String {
        return "bar"
    }

}