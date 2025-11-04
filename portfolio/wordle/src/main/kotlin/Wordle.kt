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

fun evaluateGuess(guess: String, target: String): List<Int>
{
    
}