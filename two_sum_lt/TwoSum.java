package two_sum_lt;

public class TwoSum {

    public int[] solution(int[] nums, int target) {
        int l = 0;
        int r = 1;

        while (l != r) {
            if (nums[l] + nums[r] == target) {
                return new int[]{l, r};
            }

            r++;

            if (r >= nums.length) {
                l += 1;
                r = l + 1;
            }
        }

        return new int[]{l,r};
    }
}
