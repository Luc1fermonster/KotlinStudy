package org.example.lesson_3

fun main(){
    val moveNumber1 = "[D2-D4;1]"
    val parts = moveNumber1.split(";", "-")
    println(parts[0].replace("[",""))
    println(parts[1])
    println(parts[2].replace("]",""))
}