import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here

    // test for isValid(word: String): Boolean
    "isValid should return true if the string consist of 5 character"
    {
        withClue("All capital characters") { isValid("GREAT") shouldBe true }
        withClue("Mixed case characters") { isValid("Goods") shouldBe true }
        withClue("All lowercase characters") { isValid("great") shouldBe true }
    }

    "isValid should return false if the string consist of numbers, symbol or not 5 character"
    {
        withClue("Less than 5 characters") { isValid("hi") shouldBe false }
        withClue("More than 5 characters") { isValid("WELCOME") shouldBe false }
        withClue("consist of numbers") { isValid("Hello123") shouldBe false }
        withClue("consist of symbols") { isValid("@!$^!lol") shouldBe false }
    }

    // test for readWordList(filename: String): MutableList<String>
    

    // test for pickRandomWord(words: MutableList<String>): String
    "pickRandomWord should return a word that is in a provided list"
    {
        val wordList = mutableListOf("Great","Goods","hallo") //create a example list
        val selectedWord = pickRandomWord(wordList) // pick a word in the example list
        val containWord = wordList.contains(selectedWord) // check if the word can be found in the list
        withClue("The selected word should be found in the provided list")
        {
            containWord shouldBe true
        }
    }

    // test for evaluateGuess(guess: String, target: String): List<Int>
    "evaluateGuess should return (2,2,2,2,2) if all the characters of user input match the target word"
    {
        val guess = "GREAT"
        val target = "GREAT"
        val result = evaluateGuess(guess,target)
        result shouldBe listOf(2,2,2,2,2)
    }

    "evaluateGuess should return (0,0,0,0,0) if none the characters of user input match the target word"
    {
        val guess = "HELLO"
        val target = "DADDY"
        val result = evaluateGuess(guess,target)
        result shouldBe listOf(0,0,0,0,0)
    }

    "evaluateGuess should return (1,1,1,1,1) if all the characters of user input contains the target word but did not match the position"
    {
        val guess = "HEART"
        val target = "EARTH"
        val result = evaluateGuess(guess,target)
        result shouldBe listOf(1,1,1,1,1)
    }

    "evaluateGuess should return (2,1,2,2,0) if some the characters of user input match the target word"
    {
        val guess = "HELLO"
        val target = "HOLLY"
        val result = evaluateGuess(guess,target)
        result shouldBe listOf(2,1,2,2,0)
    }


})
