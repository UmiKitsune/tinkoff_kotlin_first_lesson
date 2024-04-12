package third_task.cat_family

class Puma: Cat() {
    override val runSpeed: Int = 70
    override val swimSpeed: Int = 45
    override val sumSpeed: Int
        get() = super.sumSpeed

    override fun run() {
        println("I am Puma, and i running")
    }

    override fun swim() {
        println("I am Puma, and i swimming")
    }


}