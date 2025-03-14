package sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.logging.Logger;

import static java.time.Duration.between;
import static java.util.logging.Level.INFO;

class MainBuubleSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainBuubleSort.class.getName());

        int[] arr = new int[]{7, 1, 4, 3, 9, 5, 8, 10, 2, 6, 12, 11, 19, 13, 16, 20, 14, 17, 15, 18, 21, 29, 22, 23, 74, 32, 54, 102, 124, 65, 54, 33, 31, 44, 87, 85, 50};

        Sort sort = new Sort(arr);

        Instant start = Instant.now();
        int[] sortedArr = sort.bubbleSort();
        Instant finish = Instant.now();

        logger.log(INFO, "Sorted array with bubble sort {0} in {1}ms", new Object[]{Arrays.toString(sortedArr), between(finish, start).toMillis()});
    }
}

class MainQuickSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainQuickSort.class.getName());

        int[] arr = new int[]{7, 1, 4, 3, 9, 5, 8, 10, 2, 6, 12, 11, 19, 13, 16, 20, 14, 17, 15, 18, 21, 29, 22, 23, 74, 32, 54, 102, 124, 65, 54, 33, 31, 44, 87, 85, 50};

        Sort sort = new Sort(arr);

        Instant start = Instant.now();
        int[] sortedArr = sort.quickSort();
        Instant finish = Instant.now();

        logger.log(INFO, "Sorted array with quick sort {0} in {1}ms", new Object[]{Arrays.toString(sortedArr), between(finish, start).toMillis()});
    }
}

class MainMergeSort {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainMergeSort.class.getName());

        Node node7 = new Node(7, null);
        Node node1 = new Node(1, node7);
        Node node4 = new Node(4, node1);
        Node node9 = new Node(9, node4);

        Sort sort = new Sort(node9);

        Instant start = Instant.now();
        Node head = sort.mergeSort();
        Instant finish = Instant.now();

        logger.log(INFO, "Sorted linked list with merge sort [{0}, {1}, {2}, {3}] in {4}ms", new Object[]{head.value, head.next.value, head.next.next.value, head.next.next.next.value, between(start, finish)});
    }
}