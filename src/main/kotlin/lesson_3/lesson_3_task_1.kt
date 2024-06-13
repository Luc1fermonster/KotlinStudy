package org.example.lesson_3

fun main(){
    print("Enter your name: ")
    val name = readln()
    var greetingsText = "Good afternoon"
    println("$greetingsText $name")
    greetingsText = "Good evening"
    println("$greetingsText $name")
}