package org.example.lesson_1

fun main(){
    val seconds = 6_480
    val hours = seconds/3600
    val leftSec1 = seconds-(hours*3600)
    val minutes = leftSec1/60
    val leftSec2 = seconds - (hours*3600) - (minutes*60)
    println("$hours:$minutes:$leftSec2")
}