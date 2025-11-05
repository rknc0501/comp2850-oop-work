import java.io.File
import java.io.FileNotFoundException
import kotlin.random.Random

fun isValid(word: String): Boolean
{
    return word.length == 5 && word.all{it.isLetter()}
}

fun readWordList(filename: String): MutableList<String>
{
    try
    {
        val wordSet : MutableList<String> = File(filename).readLines().toMutableList()
        return wordSet
    }
    catch (_: FileNotFoundException)
    {
        println("Error! $filename not found.")
        return mutableListOf()
    }
    catch (_: IllegalArgumentException)
    {
        println("Error! $filename not found.")
        return mutableListOf()
    }

}


fun pickRandomWord(words: MutableList<String>): String
{
    val randomNum = Random.nextInt(0,words.size)
    val selectedWord = words[randomNum]
    return selectedWord
}

fun obtainGuess(attempt: Int): String
{
    println("Attempt $attempt")
    var userInput = readln()
    while(!isValid(userInput))
    {
        println("Error!!! input word cannot contains number or symbol")
        println("Attempt $attempt")
        userInput = readln()
    }
    return userInput
}

fun evaluateGuess(guess: String, target: String): List<Int>
{
    guess.uppercase()
    target.uppercase()
    val outputResult = mutableListOf(0,0,0,0,0)
    var character = 0
    while (character < 5)
    {
        if (target.contains(guess.uppercase()[character]))
        {
            outputResult[character] = 1
            if (guess.uppercase()[character] == target[character] )
            {
                outputResult[character] = 2
            }
        }

        character++
    }
    return outputResult
}

fun displayGuess(guess: String, matches: List<Int>)
{
    val guessing = guess.uppercase()
    println("[${guessing[0]}, ${guessing[1]}, ${guessing[2]}, ${guessing[3]}, ${guessing[4]}]")
    println(matches)
}