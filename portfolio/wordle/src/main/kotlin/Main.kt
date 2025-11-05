fun main()
{
    val attempt_times = 10 // How many attempts user have to guess the word
    val file = "/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt" //the file path of wordle list
    val wordle_wordset = readWordList(file)
    val target_word = pickRandomWord(wordle_wordset) // the word player need to guess
    var runtime = 1 // Attempt time
    var win_condition = false // check if the player successfully guess the word or not

    println("WELCOME TO WORDLE !!!")
    println("Game Rules:\n• 0 for guess letters that are not present in the target word\n" +
            "• 1 for letters that are in the target word but at a different position\n" +
            "• 2 for letters that have been guessed correctly\n You only have ${attempt_times} attempts")

    println("Target word: ${target_word}")
    while (runtime <= attempt_times && !win_condition) // loop 10 attempt for player to guess the word
    {
        val user_guess = obtainGuess(runtime)
        val runtime_result = evaluateGuess(user_guess, target_word)
        displayGuess(user_guess,runtime_result)
        if(user_guess.uppercase()==target_word)
        {
            win_condition = true
        }
        else
        {
            runtime++
        }

    }
    Win_check(win_condition)

}

fun Win_check(win_condition: Boolean) // tell player whether win or lose
{
    if (win_condition == true)
    {
        println("You Win!")
    }
    else
    {
        println("You Lose! try harder next time !!!")
    }
}
