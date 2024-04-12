package third_task

import third_task.cat_family.Manul
import third_task.cat_family.Puma
import third_task.fish_family.Bluefish
import third_task.fish_family.Dorado

fun main() {
    puma.run()
    puma.swim()
    println(puma.sumSpeed)
    println()

    manul.run()
    manul.swim()
    println(manul.sumSpeed)
    println()

    bluefish.swim()
    println(bluefish.sumSpeed)
    println()

    dorado.swim()
    println(dorado.sumSpeed)
    println()
}

val puma = Puma()
val manul = Manul()
val bluefish = Bluefish()
val dorado = Dorado()