package org.example.lesson_2

import kotlin.math.pow

const val DENOMINATOR_FOR_PERCENT = 100

fun main() {
    val previousValue = 70_000
    val interestRate = 16.7
    val duration = 20
    val futureValue = previousValue * ((1 + (interestRate / DENOMINATOR_FOR_PERCENT)).pow(duration))

    println(String.format("%.3f", futureValue))
}