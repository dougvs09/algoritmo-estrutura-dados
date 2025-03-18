package binary_search;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int num = 23;

        int result = binarySearch.search(arr, num);

        System.out.printf("Target found at index: %s", result);
    }
}
