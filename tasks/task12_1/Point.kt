import kotlin.math.hypot

class Point(var x: Double, var y: Double) 
{
    fun distance() = hypot(x, y)

    fun distanceTo(other: Point): Double {
        return hypot(x - other.x, y - other.y)
    }
}


fun main(args:Array<String>)
{
   val p = Point(10.0,5.0)

   println(p.x)   // prints 0.0
   println(p.y)   // prints 0.0
   println(p.distance())
   val x = Point(3.0,3.0)
   println(p.distanceTo(x))

}