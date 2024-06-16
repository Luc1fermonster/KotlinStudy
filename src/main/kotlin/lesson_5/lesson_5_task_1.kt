package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val numberForBotCheck1 = Random.nextInt(1, 50)
    val numberForBotCheck2 = Random.nextInt(1, 50)
    println(
        """Здравствуйте. Нам нужно понять, что вы не робот
        |Для этого с клавиатуры введите одно число - ответ для примера $numberForBotCheck1 + $numberForBotCheck2: 
    """.trimMargin()
    )
    val numberRead = readln().toInt()
    if (numberRead == (numberForBotCheck2 + numberForBotCheck1)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён")
    }
}