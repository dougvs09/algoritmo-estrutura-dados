package maximun_length_substring_with_two_occurrences_lt;

public class Main {

    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();

        String word = "bcbbbcba";

        int result = slidingWindow.maximumLengthSubstring(word);

        System.out.printf("Target found at index: %d", result);
    }
}
