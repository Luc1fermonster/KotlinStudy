package org.example.lesson_4

const val TABLES_IN_RESTAURANT = 13

fun main(){
    val bookedForToday = TABLES_IN_RESTAURANT
    val notBookedForTomorrow = 4
    val bookedForTomorrow = TABLES_IN_RESTAURANT - notBookedForTomorrow
    val readyForToday = (TABLES_IN_RESTAURANT != bookedForToday)
    val readyForTomorrow = (TABLES_IN_RESTAURANT != bookedForTomorrow)

    println("[Доступность столиков на сегодня: $readyForToday] \n[Доступность столиков на завтра: $readyForTomorrow]")
}