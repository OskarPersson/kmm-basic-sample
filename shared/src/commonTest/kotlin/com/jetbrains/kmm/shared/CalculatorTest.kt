package com.jetbrains.kmm.shared

import kotlin.test.Test
import kotlin.test.assertEquals

import org.mockito.kotlin.*

class CalculatorTest {

    @Test
    fun testSum() {
        assertEquals(3, Calculator.sum(1, 2))
    }

    @Test
    fun testMock() {
        val mockGen = mock<Generator> {
            on { gen() } doReturn "mocked"
        }
        assertEquals("bar", Calculator(DefaultGenerator()).foo())
        assertEquals("mocked", Calculator(mockGen).foo())
    }

}