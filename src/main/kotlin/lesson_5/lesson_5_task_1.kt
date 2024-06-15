package org.example.lesson_5

fun main() {
    val numberForBotCheck1 = 9
    val numberForBotCheck2 = 22
    println("""Здравствуйте. Нам нужно понять, что вы не робот
        |Для этого с клавиатуры введите одно число - ответ для примера $numberForBotCheck1 + $numberForBotCheck2: 
    """.trimMargin())
    val numberRead = readln().toInt()
    if (numberRead == (numberForBotCheck2+numberForBotCheck1)) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещён")
    }
}