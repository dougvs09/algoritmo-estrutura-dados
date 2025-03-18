package exponential_search;

public class Main {
    public static void main(String[] args) {
        ExponentialSearch exponentialSearch = new ExponentialSearch();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int num = 23;

        int result = exponentialSearch.search(arr, num);

        System.out.printf("Target found at index: %d", result);
    }
}
