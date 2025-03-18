package reverse_word_lt;

import java.util.Objects;

class ReverseWords {

    public String solution(String s) {
        String[] arr = s.split("");
        int l = 0;
        int r = 0;
        String cr = "";
        String cl = "";

        while (r < arr.length) {
            if (Objects.equals(arr[r], " ")) {
                int curr = r;
                r--;

                while (r > l) {
                    cr = arr[r];
                    cl = arr[l];

                    arr[r] = cl;
                    arr[l] = cr;

                    r--;
                    l++;
                }

                l = curr + 1;
                r = curr;
            }

            r++;
        }

        r--;
        while (r > l) {
            cr = arr[r];
            cl = arr[l];

            arr[r] = cl;
            arr[l] = cr;

            r--;
            l++;
        }

        return String.join("", arr);
    }
}
