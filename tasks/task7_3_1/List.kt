// Task 7.3.1: list element access
fun main()
{
   val number = List<Float>(100) { 0.0f }
   val greetings = List<String>(5) { "Hello" }
   val numbers = mutableListOf(9, 3, 6, 2)  //mutable makes the list editable instead of fixed list
   val names = listOf("Nine", "Three", "Six", "Two")
   val age = mutableListOf<Int> () // empty mutabnle list 

   println(numbers)
   println(numbers[0])
   println(numbers.get(0))
   println(numbers.slice(1..2))
   println("${numbers.first()} ${numbers.last()}")
   numbers.add(3)
   println(numbers.size)
   println(value.size)
   println(age.size)
} 