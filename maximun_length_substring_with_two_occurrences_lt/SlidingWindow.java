package maximun_length_substring_with_two_occurrences_lt;

import java.util.HashMap;

public class SlidingWindow {

    public int maximumLengthSubstring(String s) {
        String[] arr = s.split("");
        int r = 0;
        int l = 0;
        int max = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (r < arr.length) {
            if (!hashMap.containsKey(arr[r])) {
                hashMap.put(arr[r], 1);
            } else {
                hashMap.computeIfPresent(arr[r], (k, v) -> v + 1);
            }
            r++;

            while (hashMap.get(arr[r - 1]) == 3) {
                hashMap.computeIfPresent(arr[l], (k, v) -> v - 1);
                l++;
            }

            max = Math.max(max, r - l);
        }

        return max;
    }
}
