package reverse_word_lt;

public class Main {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();

        String word = "Let's take LeetCode contest";

        String reversedWord = reverseWords.solution(word);

        System.out.printf("Reversed word: %s", reversedWord);
    }
}
