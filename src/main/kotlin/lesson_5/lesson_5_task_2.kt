package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите ваш год рождения: ")
    val yearOfBirth = readln().toInt()
    val currentYear= LocalDate.now().year
    if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    else {
        println("Контент недоступен")
    }
}