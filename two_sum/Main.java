package two_sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] arr = new int[]{3, 3};
        int target = 6;

        int[] result = twoSum.twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
