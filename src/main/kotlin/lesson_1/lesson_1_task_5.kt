package org.example.lesson_1

fun main(){
    var seconds = 6_480
    val hours = seconds/3600
    val leftSec1 = seconds-(hours*3600)
    val minutes = leftSec1/60
    seconds = seconds - (hours*3600) - (minutes*60)
    println(String.format(("%02d:%02d:%02d"), hours, minutes, seconds))
}