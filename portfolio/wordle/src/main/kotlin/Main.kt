fun main()
{
    val attemptTimes = 10 // How many attempts user have to guess the word
    val file = "/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt" //the file path of wordle list
    val wordleWordset = readWordList(file) // extract all the available words from words.txt

    if (wordleWordset.isEmpty()) // check whether the word set is successfully extracted
    {
        println("Word set is empty, cannot start game")
        return // terminate the program if wordle wordset is empty
    }
    else
    {
        gameProgram(attemptTimes,wordleWordset) // start the game if no error
    }

}

fun winCheck(winCondition: Boolean, targetWord: String) // tell player whether win or lose the game
{
    if (winCondition)
    {
        println("You Win !!! The target word is $targetWord")
    }
    else
    {
        println("You Lose (T_T). The target word is $targetWord\nTry harder next time !!!")
    }
}

fun gameProgram(attemptTimes: Int,wordleWordset: MutableList<String> )
{
    val targetWord = pickRandomWord(wordleWordset) // the word player need to guess
    var runtime = 1 // Attempt time
    var winCondition = false // check if the player successfully guess the word or not

    println("WELCOME TO WORDLE !!!")
    println("Game Rules:\n• 0 for guess letters that are not present in the target word\n" +
            "• 1 for letters that are in the target word but at a different position\n" +
            "• 2 for letters that have been guessed correctly\n You only have $attemptTimes attempts")

    println("Target word: $targetWord")
    while (runtime <= attemptTimes && !winCondition) // loop 10 attempt for player to guess the word
    {
        val userGuess = obtainGuess(runtime)
        val runtimeResult = evaluateGuess(userGuess, targetWord)
        displayGuess(userGuess,runtimeResult)
        if(userGuess.uppercase()==targetWord)
        {
            winCondition = true
        }
        else
        {
            runtime++
        }

    }
    winCheck(winCondition, targetWord)
}

