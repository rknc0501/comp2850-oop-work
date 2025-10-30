// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: String) {
    var isMarried = false

     init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

fun main(args: Array<String>)
{
   println("Enter your name")
   var name = readln()
   println("Enter your Date of birth")
   var date = readln()

   var p1 = Person(name,date)
   println(p1.name)
   println(p1.birth)
   
}

