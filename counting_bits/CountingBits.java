package counting_bits;

public class CountingBits {

    public int[] solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        int x;

        for(int i = 1; i < arr.length; i++) {
            int y = 0;
            x = i;

            while (x > 0) {
                if ((x & 1) == 1) {
                    y++;
                }

                x >>= 1;
            }

            arr[i] = y;
        }

        return arr;
    }
}
