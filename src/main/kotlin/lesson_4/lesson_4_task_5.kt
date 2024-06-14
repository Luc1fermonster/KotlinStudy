package org.example.lesson_4

fun main() {
    println("Есть ли повреждения? (ответ в формате true или false)")
    val damage = readln().toBoolean()

    println("Сколько человек в экипаже? (ответ - одно число)")
    val crewSize = readln().toInt()

    println("Сколько у вас ящиков с провизией? (ответ - одно целое число)")
    val numberOfProvisionBoxes = readln().toInt()

    println("Метеоусловия благоприятны? (ответ в формате true или false)")
    val favorableWeatherConditions = readln().toBoolean()

    val voyageIsPossible:Boolean = (!damage && ((crewSize >= 55) && (crewSize <= 70)) && numberOfProvisionBoxes > 50) || (crewSize == 70 && favorableWeatherConditions && numberOfProvisionBoxes >= 50)
    println("возможность отправки в плавание: $voyageIsPossible")
}
