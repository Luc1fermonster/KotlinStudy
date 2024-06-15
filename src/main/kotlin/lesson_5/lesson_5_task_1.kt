package org.example.lesson_5

fun main() {
    println("""Здравствуйте. Нам нужно понять, что вы не робот
        |Для этого с клавиатуры введите одно число - ответ для примера 9 + 22: 
    """.trimMargin())
    val numberRead: String = readln()
    if (numberRead == "31") {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещён")
    }
}