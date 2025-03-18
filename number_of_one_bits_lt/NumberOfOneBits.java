package number_of_one_bits_lt;

public class NumberOfOneBits {

    public int solution(int n) {
        int x = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                x++;
            }

            n >>= 1;
        }

        return x;
    }
}
