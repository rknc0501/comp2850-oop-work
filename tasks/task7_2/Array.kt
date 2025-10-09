fun main() 
{
    val numbers = arrayOf(9, 6, 3, 2)
    val num = IntArray(10)
    val cls = numbers::class

    val arr = Array(5) { 0 }          // Int array of size 5, all 0
    val arr2 = arrayOf(1, 2, 3, 4, 5) // Direct initialization
    val arr3 = IntArray(5)   

    println(cls.qualifiedName)
    println(cls.java)
    println(num.size) //create an empty array with fixed size


}