package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstWinningNumber = Random.nextInt(1, 43)
    val secondWinningNumber = Random.nextInt(1, 43)
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