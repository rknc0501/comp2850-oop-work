// Task 12.3.1: secondary constructors

class Point(var x: Double, var y: Double)
{
    constructor(): this(0.0,0.0)
}

fun main() {
    val p = Point(4.5, 7.0)
    println("(${p.x}, ${p.y})")
}
