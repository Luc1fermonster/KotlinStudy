package org.example.lesson_2

fun main(){
    val numberOfWorkers = 50
    val workerSalary = 30000
    val numberOfIntern = 30
    val internSalary = 20000
    val workerSpending = numberOfWorkers * workerSalary
    val salarySpending = workerSpending + (numberOfIntern * internSalary)
    val averageSalary = salarySpending / (numberOfIntern + numberOfIntern)
    println(workerSpending)
    println(salarySpending)
    println(averageSalary)
}