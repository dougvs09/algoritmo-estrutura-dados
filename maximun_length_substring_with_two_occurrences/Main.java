package maximun_length_substring_with_two_occurrences;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        SlidingWindow slidingWindow = new SlidingWindow();

        String word = "bcbbbcba";

        int result = slidingWindow.maximumLengthSubstring(word);

        logger.log(INFO, "Target found at index: {0}", result);
    }
}
