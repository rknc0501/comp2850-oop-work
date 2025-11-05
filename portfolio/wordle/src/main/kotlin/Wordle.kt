import java.io.File
import java.io.FileNotFoundException
import kotlin.random.Random

fun isValid(word: String): Boolean
{
    if(word.length == 5 && word.all{it.isLetter()})
    {
        return true
    }
    else
    {
        return false
    }
}

fun readWordList(filename: String): MutableList<String>
{
    try
    {
        val word_set : MutableList<String> = File(filename).readLines().toMutableList()
        return word_set
    }
    catch (e: FileNotFoundException)
    {
        println("Error! ${filename} not found.")
        return mutableListOf()
    }
}


fun pickRandomWord(words: MutableList<String>): String
{
    var Random_num = Random.nextInt(0,words.size)
    val selected_word = words[Random_num]
    return selected_word
}

fun obtainGuess(attempt: Int): String
{
    println("Attempt ${attempt}")
    var User_input = readln()
    while(isValid(User_input)==false)
    {
        println("Error!!! input word cannot contains number or symbol")
        println("Attempt ${attempt}")
        User_input = readln()
    }
    return User_input
}

fun evaluateGuess(guess: String, target: String): List<Int>
{
    guess.uppercase()
    target.uppercase()
    val output_result = mutableListOf<Int>(0,0,0,0,0)
    var character = 0
    while (character < 5)
    {
        if (target.contains(guess.uppercase()[character]))
        {
            output_result[character] = 1
            if (guess.uppercase()[character] == target[character] )
            {
                output_result[character] = 2
            }
        }

        character++
    }
    return output_result
}

fun displayGuess(guess: String, matches: List<Int>)
{
    val guessing = guess.uppercase()
    println("[${guessing[0]}, ${guessing[1]}, ${guessing[2]}, ${guessing[3]}, ${guessing[4]}]")
    println(matches)
}