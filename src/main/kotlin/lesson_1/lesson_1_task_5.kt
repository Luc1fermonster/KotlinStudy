package org.example.lesson_1

fun main() {
    val secInMin = 60
    val secInHour = 3600
    val seconds = 6480
    println(String.format(("%02d:%02d:%02d"), (seconds / secInHour), (seconds % secInHour) / secInMin , (seconds % secInMin)))
}