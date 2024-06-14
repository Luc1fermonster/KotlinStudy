package org.example.lesson_2

const val MIN_IN_HOUR = 60

fun main() {
    val minStart = 39
    val hourStart = 9
    val minInTransit = 457
    val minArrive = minStart + minInTransit
    val arriveHour = minArrive / MIN_IN_HOUR
    val remainingMinutes = minArrive % MIN_IN_HOUR

    println(String.format(("%02d:%02d"), (hourStart + arriveHour), remainingMinutes))
}