// Task 8.4.1: experimenting with sequences

fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)

    val result = numbers.sorted()   // make changes here
    val results = numbers.asSequence()
    println(result)
    println(results)
}
