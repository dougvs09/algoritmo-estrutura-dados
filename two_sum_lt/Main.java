package two_sum_lt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] arr = new int[]{3, 3};
        int target = 6;

        int[] result = twoSum.solution(arr, target);

        System.out.printf("Sum found at indexes: %s", Arrays.toString(result));
    }
}
