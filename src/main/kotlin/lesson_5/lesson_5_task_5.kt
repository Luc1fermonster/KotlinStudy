package org.example.lesson_5

fun main() {
    val lastNumberInRandom = 43
    val numberOfGuesses = 3
    val randomNumbers = mutableListOf<Int>()
    for (i in 1..numberOfGuesses) {
        val randomNumber = (1..lastNumberInRandom).random()
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