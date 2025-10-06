// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readAnInteger(): Int
{
    println("please enter a number in the set(4, 6, 8, 10, 12, 20)")
    var number = readln().toInt()
    return number
}

fun main(args:Array<String>)
{
    var result = readAnInteger()
    rollDie(result)
}
