package first_unique_char;

import java.util.HashMap;

public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        int l = 0;
        int r = 0;
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        while (r < arr.length) {
            if (!hashMap.containsKey(arr[r])) {
                hashMap.put(arr[r], 1);
            } else {
                hashMap.computeIfPresent(arr[r], (k, v) -> v + 1);
            }
            r++;

            while (l < r && hashMap.get(arr[l]) > 1) {
                l++;
            }
        }

        if (l == r) {
            return -1;
        }

        return l;
    }
}
