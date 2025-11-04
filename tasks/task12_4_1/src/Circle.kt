// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double)
{
     init{
         require(radius > 0)
     }

     fun area(): Double 
     {
        return radius*radius*PI
     }

     fun perimeter(): Double 
     {
        return 2*radius*PI
     }
}
