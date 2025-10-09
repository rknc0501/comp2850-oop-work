// Task 7.7.1: stats for a numeric dataset
fun readData() : List<Float>
{
    var numberSet = mutableListOf<Float>()
    // Print a prompt for the user
    var number: Float = 0.0f
    do{
        println("Enter a number, to stop enter 0")
        number = readln().toFloat()
        if(number == 0.0f)
        {
            println("END")
        }
        else
        {
            numberSet.add(number)
        }

    }while(number!=0.0f)

    return numberSet
    // Write a loop to read the numbers
    // Inside this loop, call add() to add a number to list
}

fun sortMedian(List<Float> numberSet) : Float
{
   numberSet.sortMedian()

}


fun main(args:Array<String>)
{
     
}