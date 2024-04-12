package third_task.cat_family

import third_task.Pet
import third_task.interfaces.Runnable
import third_task.interfaces.Swimmable

open class Cat : Pet(), Runnable, Swimmable {
    override val runSpeed: Int = 20
    override val swimSpeed: Int = 20
    override val sumSpeed: Int
        get() {
            return runSpeed + swimSpeed
        }

    override fun run() {
        println("I am Cat, and i running")
    }

    override fun swim() {
        println("I am Cat, and i swimming")
    }
}