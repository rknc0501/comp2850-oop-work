// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circleParameter(radius: Double) = 2 * PI * radius
fun readDouble(): Double
{
    println("enter a circle radius")
    var radius = readln().toDouble()
    return radius
}

fun main(args: Array<String>)
{
    var radius = readDouble()
    println("Area of it is "+circleArea(radius))
    println("Parameter of it is "+circleParameter(radius))
}


