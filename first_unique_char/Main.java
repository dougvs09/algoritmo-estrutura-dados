package first_unique_char;

import two_sum.TwoSum;

public class Main {

    public static void main(String[] args) {
        FirstUniqueChar solution = new FirstUniqueChar();

        String word = "aabbc";

        int result = solution.firstUniqChar(word);

        System.out.println(result);
    }
}
