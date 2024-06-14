package org.example.lesson_4

fun main() {
    val weather = "солнечная"
    val tentCondition = "открыт"
    val  humidity = 20
    val season = "зима"

    println("Благоприятность для роста бобовых сейчас: ${(weather == "солнечная") && (tentCondition == "открыт") && (humidity == 20) && (season != "зима")}")
}