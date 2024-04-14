package third_task.fish_family

import third_task.Pet
import third_task.interfaces.Swimmable

open class Fish: Pet(), Swimmable {
    override val swimSpeed: Int = 30
    override val sumSpeed: Int
        get() {
            return swimSpeed
        }

    override fun swim() {
        println("I am ${this.javaClass.simpleName}, and i swimming")
    }

}