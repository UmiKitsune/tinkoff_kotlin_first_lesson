package third_task.fish_family

class Bluefish: Fish() {
    override val swimSpeed: Int = 15
    override val sumSpeed: Int
        get() = super.sumSpeed

    override fun swim() {
        println("I am Bluefish, and i swimming")
    }
}