package first_unique_char;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        FirstUniqueChar solution = new FirstUniqueChar();

        String word = "aabbc";

        int result = solution.firstUniqChar(word);

        logger.log(INFO, "Character found at index: {0}", result);
    }
}
