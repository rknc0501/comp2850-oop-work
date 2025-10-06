// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(args: Array<String>)
{
    println("Enter a word")
    var FirstLetter = readln()
    println("Enter a second letter that have the same length with with word")
    var SecondLetter = readln()
    println(FirstLetter +" "+SecondLetter )
    var isAnagrams:Boolean = anagrams(FirstLetter,SecondLetter)
    if(isAnagrams == true)
    {
        println("They are anagram")
    }
    else if(isAnagrams == false)
    {
        println("They are not anagram")
    }




}