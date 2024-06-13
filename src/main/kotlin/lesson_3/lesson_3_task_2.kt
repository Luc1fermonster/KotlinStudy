package org.example.lesson_3

fun main(){
    var age = "20"
    var surname = "Андреева"

    val name = "Татьяна"
    val patronymic = "Сергеевна"

    println("$surname $name $patronymic, возраст: $age лет")

    age = "22" //2 years later
    surname = "Сидорова" //got married

    println("$surname $name $patronymic, возраст: $age лет")
}