package org.example.lesson_2


fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 1.2
    val crystalOreBuffed = crystalOre * buffMultiplier
    val ironOreBuffed = ironOre * buffMultiplier
    println("Crystal buffed ore ${crystalOreBuffed.toInt()}")
    println("Iron buffed ore ${ironOreBuffed.toInt()}")
}