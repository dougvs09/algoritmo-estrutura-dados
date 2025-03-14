package sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.logging.Logger;

import static java.time.Duration.between;
import static java.util.logging.Level.INFO;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        int[] arrB = new int[]{7, 1, 4, 3, 9, 5, 8, 10, 2, 6, 12, 11, 19, 13, 16, 20, 14, 17, 15, 18, 21, 29, 22, 23, 74, 32, 54, 102, 124, 65, 54, 33, 31, 44, 87, 85, 50};
        int[] arrQ = new int[]{7, 1, 4, 3, 9, 5, 8, 10, 2, 6, 12, 11, 19, 13, 16, 20, 14, 17, 15, 18, 21, 29, 22, 23, 74, 32, 54, 102, 124, 65, 54, 33, 31, 44, 87, 85, 50};
        Node node7 = new Node(7, null);
        Node node1 = new Node(1, node7);
        Node node4 = new Node(4, node1);
        Node node9 = new Node(9, node4);

        Sort sortB = new Sort(arrB);
        Sort sortQ = new Sort(arrQ);

        Instant startB = Instant.now();
        int[] sortedArrB = sortB.bubbleSort();
        Instant finishB = Instant.now();

        Instant startQ = Instant.now();
        int[] sortedArrQ = sortQ.quickSort();
        Instant finishQ = Instant.now();

        Instant startM = Instant.now();
        Node head = sortQ.mergeSort(node9);
        Instant finishM = Instant.now();

        logger.log(INFO, "Sorted array with bubble sort {0} in {1}ms", new Object[]{Arrays.toString(sortedArrB), between(finishB, startB).toMillis()});
        logger.log(INFO, "Sorted array with quick sort {0} in {1}ms", new Object[]{Arrays.toString(sortedArrQ), between(finishQ, startQ).toMillis()});
        logger.log(INFO, "Sorted linked list with merge sort [{0}, {1}, {2}, {3}] in {4}ms", new Object[]{head.value, head.next.value, head.next.next.value, head.next.next.next.value, between(startM, finishM)});
    }
}