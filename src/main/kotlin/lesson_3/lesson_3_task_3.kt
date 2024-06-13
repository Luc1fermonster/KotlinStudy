package org.example.lesson_3

val numberToLearn: Int = 6
fun main(){
    printMultiplicationTable()
}

fun printTableLine(multiplier: Int, result: Int) {
    println("$numberToLearn * $multiplier = $result")
}

fun printMultiplicationTable() {
    for (multiplier in 1..10) {
        val result = numberToLearn * multiplier
        printTableLine(multiplier, result)
    }
}