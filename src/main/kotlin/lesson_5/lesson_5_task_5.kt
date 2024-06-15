package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randomNumbers = mutableListOf<Int>()
    for (i in 1..3) {
        val randomNumber = Random.nextInt(1, 43)
        randomNumbers.add(randomNumber)
    }
    val variablesList = mutableListOf<Int>()

    println("Попробуйте угадать число от 1 до 42. У вас будет 3 попытки")

    Thread.sleep(2000)

    for (i in 1..3) {
        print("Ваше число номер $i: ")
        val input = readln().toInt()
        variablesList.add(input)
    }
    val intersection = variablesList.intersect(randomNumbers.toSet())
    when (intersection.size) {
        3 -> {
            println("ПОЗДРАВЛЯЕМ, ВЫ ВЫИГРАЛИ ДЖЕКПОТ!!!")
        }
        2 -> {
            println("Поздравляем, вы выиграли крупный приз")
        }
        1 -> {
            println("Вы выиграли утешительный приз")
        }
        else -> {
            println("удача сегодня не на твой стороне")
        }
    }
    println("А правильными числами были ${randomNumbers[0]}, ${randomNumbers[1]} и ${randomNumbers[2]}")
}