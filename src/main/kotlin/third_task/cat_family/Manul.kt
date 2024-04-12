package third_task.cat_family

class Manul: Cat() {
    override val runSpeed: Int = super.runSpeed
    override val swimSpeed: Int = 15
    override val sumSpeed: Int
        get() = super.sumSpeed

    override fun run() {
        println("I am Manul, and i running")
    }

    override fun swim() {
        println("I am Manul, and i swimming")
    }
}