package org.example.lesson_2

const val DENOMINATOR_FOR_PERCENT = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 20.0
    val crystalOreBuffed = ((buffMultiplier / DENOMINATOR_FOR_PERCENT) + 1) * crystalOre
    val ironOreBuffed = ((buffMultiplier / DENOMINATOR_FOR_PERCENT) + 1) * ironOre
    println("Crystal buffed ore ${crystalOreBuffed.toInt()}")
    println("Iron buffed ore ${ironOreBuffed.toInt()}")
}