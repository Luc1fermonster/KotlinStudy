package org.example.lesson_5

const val START_OF_LIST_OF_RANDOM_NUMBERS = 1
const val END_OF_LIST_OF_RANDOM_NUMBERS = 43

fun main() {
    val firstWinningNumber = (START_OF_LIST_OF_RANDOM_NUMBERS .. END_OF_LIST_OF_RANDOM_NUMBERS).random()
    val secondWinningNumber = (START_OF_LIST_OF_RANDOM_NUMBERS .. END_OF_LIST_OF_RANDOM_NUMBERS).random()
    println("сделайте первую попытку: ")
    val firstGuess = readln().toInt()

    println("сделайте вторую попытку: ")
    val secondGuess = readln().toInt()

    val isSuperPrize = (firstGuess == firstWinningNumber || firstGuess == secondWinningNumber) &&
            (secondGuess == firstWinningNumber || secondGuess == secondWinningNumber) &&
            (firstGuess != secondGuess)

    val isConsolationPrize = (firstGuess == firstWinningNumber || firstGuess == secondWinningNumber) ||
            (secondGuess == firstWinningNumber || secondGuess == secondWinningNumber)

    when {
        isSuperPrize -> println("Поздравляем! Вы выиграли главный приз!")
        isConsolationPrize -> println("Вы выиграли утешительный приз!")
        else -> println("В этот раз вам не повезло")
    }
    println("загаданы были числа $firstWinningNumber и $secondWinningNumber")
}