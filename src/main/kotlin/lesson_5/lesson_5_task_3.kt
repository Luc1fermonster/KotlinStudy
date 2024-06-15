package org.example.lesson_5

const val FIRST_WINNING_NUMBER = 11
const val SECOND_WINNING_NUMBER = 24

fun main() {
    println("сделайте первую попытку: ")
    val firstGuess = readln().toInt()

    println("сделайте вторую попытку: ")
    val secondGuess = readln().toInt()

    val isSuperPrize = (firstGuess == FIRST_WINNING_NUMBER || firstGuess == SECOND_WINNING_NUMBER) &&
            (secondGuess == FIRST_WINNING_NUMBER || secondGuess == SECOND_WINNING_NUMBER) &&
            (firstGuess != secondGuess)

    val isConsolationPrize = (firstGuess == FIRST_WINNING_NUMBER || firstGuess == SECOND_WINNING_NUMBER) ||
            (secondGuess == FIRST_WINNING_NUMBER || secondGuess == SECOND_WINNING_NUMBER)

    when {
        isSuperPrize -> println("Поздравляем! Вы выиграли главный приз!")
        isConsolationPrize -> println("Вы выиграли утешительный приз!")
        else -> println("В этот раз вам не повезло")
    }
}