package third_task.fish_family

class Dorado: Fish() {
    override val swimSpeed: Int = 40
    override val sumSpeed: Int
        get() = super.sumSpeed

    override fun swim() {
        println("I am Dorado, and i swimming")
    }
}