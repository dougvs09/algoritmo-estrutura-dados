package two_sum;

import java.util.Arrays;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        TwoSum twoSum = new TwoSum();

        int[] arr = new int[]{3, 3};
        int target = 6;

        int[] result = twoSum.twoSum(arr, target);

        logger.log(INFO, "Sum found at indexes: {0}", Arrays.toString(result));
    }
}
