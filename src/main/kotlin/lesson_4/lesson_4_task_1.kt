package org.example.lesson_4

const val TABLES_IN_RESTAURANT = 13

fun main(){
    val bookedForToday = 13
    val bookedForTomorrow = 9
    val readyForToday = (TABLES_IN_RESTAURANT != bookedForToday)
    val readyForTomorrow = (TABLES_IN_RESTAURANT != bookedForTomorrow)

    println("[Доступность столиков на сегодня: $readyForToday] \n[Доступность столиков на завтра: $readyForTomorrow]")
}