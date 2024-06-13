package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val previousValue = 70_000
    val interestRate = 0.167
    val duration = 20
    val futureValue = previousValue * ((1 + interestRate).pow(duration))
    println(String.format("%.3f", futureValue))
}