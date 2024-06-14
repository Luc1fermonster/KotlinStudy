package org.example.lesson_4

const val MAX_CREW_SIZE = 70
const val MIN_CREW_SIZE = 55
const val NUMBER_OF_PROVISION_BOXES = 50

fun main() {
    println("Есть ли повреждения? (ответ в формате true или false)")
    val damage = readln().toBoolean()

    println("Сколько человек в экипаже? (ответ - одно число)")
    val crewSize = readln().toInt()

    println("Сколько у вас ящиков с провизией? (ответ - одно целое число)")
    val numberOfProvisionBoxes = readln().toInt()

    println("Метеоусловия благоприятны? (ответ в формате true или false)")
    val favorableWeatherConditions = readln().toBoolean()

    val voyageIsPossible: Boolean = (!damage &&
            ((crewSize >= MIN_CREW_SIZE) && (crewSize <= MAX_CREW_SIZE)) &&
            numberOfProvisionBoxes > NUMBER_OF_PROVISION_BOXES) ||
            (crewSize == MAX_CREW_SIZE && favorableWeatherConditions &&
                    numberOfProvisionBoxes >= NUMBER_OF_PROVISION_BOXES)

    println("возможность отправки в плавание: $voyageIsPossible")
}
