package reverse_word_leet_code;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        ReverseWords reverseWords = new ReverseWords();

        String word = "Let's take LeetCode contest";

        String reversedWord = reverseWords.reverseWords(word);

        logger.log(INFO,"Reversed word: {0}", reversedWord);
    }
}
