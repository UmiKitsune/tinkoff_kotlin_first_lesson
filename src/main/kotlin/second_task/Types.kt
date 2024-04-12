package second_task

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    determineType(null)
    determineType("Найди котика в коде =)")
    determineType(50)
    determineType(20.123)
    determineType(20.1)
    determineType(LocalDate.of(2002, 12, 24))
    determineType(LocalDate.of(2006, 12, 24))
    determineType(LocalDate.now())
    determineType(4f)
}

fun determineType(obj: Any?) {
    if (obj == null) {
        println("Объект равен null")
        return
    }

    val tinkoffFoundationDay = LocalDate.of(2006, 12, 24)
    val dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy")

    val answer = when (obj) {
        is String -> "Я получил тип String = '$obj', ее длина равна ${obj.length} символа"
        is Int -> "Я получил Int = $obj, его квадрат равен ${obj * obj}"
        is Double -> "Я получил Double = ${obj}, это число округляется до ${"%.2f".format(obj)}"
        is LocalDate ->
            if (obj.isBefore(tinkoffFoundationDay))
                "Я получил LocalData = ${dateFormatter.format(obj)}, эта дата меньше, чем дата основания Tinkoff"
            else if(obj.isEqual(tinkoffFoundationDay))
                "Я получил LocalData = ${dateFormatter.format(obj)}, это дата основания Tinkoff ฅ^•ﻌ•^ฅ"
            else
                "Я получил LocalData = ${dateFormatter.format(obj)}, эта дата больше, чем дата основания Tinkoff"
        else -> "Мне этот тип неизвестен"
    }

    println(answer)

}
