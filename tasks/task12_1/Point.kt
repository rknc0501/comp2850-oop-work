import kotlin.math.hypot

class Point(var x: Double, var y: Double) 
{
    fun distance() = hypot(x, y)
}

fun 

fun main(args:Array<String>)
{
    val p = Point(10.0,5.0)
    

println(p.x)   // prints 0.0
println(p.y)   // prints 0.0
println(p.distance())

}