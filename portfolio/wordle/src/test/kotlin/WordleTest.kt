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
        val wordList = mutableListOf("Great","Goods","hallo")
        val selectedWord = pickRandomWord(wordList)
        val containWord = wordList.contains(selectedWord)
        withClue("The selected word should be found in the provided list")
        {
            containWord shouldBe true
        }
    }
})
