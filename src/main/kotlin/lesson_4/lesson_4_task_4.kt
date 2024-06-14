package org.example.lesson_4

const val DAY = 5

fun main() {
    val isDayEven = DAY % 2 == 0

    println("""
        упражнения для рук:    ${!isDayEven}
        упражнения для ног:    $isDayEven
        упражнения для спины:  $isDayEven
        упражнения для пресса: ${!isDayEven}
    """.trimIndent())
}
