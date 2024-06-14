package org.example.lesson_4

fun main() {
    val day = 5
    val firstDay = "руки и пресс"
    val isDayEven = day % 2 == 0
    val isHandDay = firstDay == "руки и пресс"

    println("""
        упражнения для рук:    ${!isDayEven && isHandDay}
        упражнения для ног:    ${isDayEven && isHandDay}
        упражнения для спины:  ${isDayEven && isHandDay}
        упражнения для пресса: ${!isDayEven && isHandDay}
    """.trimIndent())
}
