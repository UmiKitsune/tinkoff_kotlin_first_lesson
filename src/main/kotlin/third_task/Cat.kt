package third_task

open class Cat() : Pet(), Runnable, Swimmable {
    override val runSpeed: Int
        get() = TODO("Not yet implemented")
    override val swimSpeed: Int
        get() = TODO("Not yet implemented")
    override var sumSpeed: Int = 0

    override fun run() {
        println("I am Cat, and i running")
    }

    override fun swim() {
        println("I am Cat, and i swimming")
    }
}