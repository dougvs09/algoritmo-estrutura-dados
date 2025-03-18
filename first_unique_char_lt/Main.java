package first_unique_char_lt;

public class Main {

    public static void main(String[] args) {
        FirstUniqueChar solution = new FirstUniqueChar();

        String word = "aabbc";

        int result = solution.solution(word);

        System.out.printf("Character found at index: %d", result);
    }
}
