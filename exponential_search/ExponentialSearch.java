package exponential_search;

public class ExponentialSearch {

    public int search(int[] arr, int target) {
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

        return this.binarySearch(arr, target, l, r);
    }

    public int binarySearch(int[] arr, int target, int l, int r) {
        int m;

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
}
