package third_task

interface Runnable {
    val runSpeed: Int
    var sumSpeed: Int
    fun run()
}

interface Swimmable {
    val swimSpeed: Int
    var sumSpeed: Int
    fun swim ()
}