package third_task

class Puma: Cat() {
    override val runSpeed: Int = 60
    override val swimSpeed: Int = 60
    override var sumSpeed: Int
        get() = super.sumSpeed
        set(value) {}

    override fun run() {
        println("I am Puma, and i running")
    }

    override fun swim() {
        println("I am Puma, and i swimming")
    }
}