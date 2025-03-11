package binary_search;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] arr, int target) {
        int l = 0;
        int m;
        int r = arr.length - 1;

        while (l < r) {
            m = (r + l) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                l = m;
            } else {
                r = m;
            }
        }

        return -1;
    }

    public int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }

        int l = 0;
        int r = 1;

        while (r < target) {
            l = r;
            r *= 2;
        }

        if (r == target) {
            return r;
        }

        if (r > arr.length - 1) {
            r = arr.length - 1;
        }

        return this.search(Arrays.copyOfRange(arr, l, r), target);
    }
}
