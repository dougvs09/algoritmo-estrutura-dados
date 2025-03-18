package number_of_one_bits_lt;

public class Main {
    public static void main(String[] args) {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();

        int number = 11;

        int oneBitsNumber = numberOfOneBits.solution(number);

        System.out.printf("Number of 1 bits in number %s: %d", number, oneBitsNumber);
    }
}
