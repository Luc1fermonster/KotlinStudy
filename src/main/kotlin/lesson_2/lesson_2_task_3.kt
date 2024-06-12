package org.example.lesson_2

fun main() {

    val minInHour = 60
    val minStart = 39
    val hourStart = 9
    val minInTransit = 457

    println(String.format(("%02d:%02d"), (hourStart + ((minInTransit + minStart) / minInHour)), ((minStart + minInTransit) % minInHour)))
}