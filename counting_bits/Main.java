package counting_bits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();

        int number = 5;

        int[] arr = countingBits.solution(number);

        System.out.printf("Array %s with the count of bits of the number %d", Arrays.toString(arr), number);
    }
}
