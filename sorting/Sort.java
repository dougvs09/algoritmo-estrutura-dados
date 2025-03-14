package sorting;

public class Sort {

    private final int[] arr;

    Sort(int[] arr) {
        this.arr = arr;
    }

    public int[] bubbleSort() {
        for (int i = 0; i < this.arr.length; i++) {
            boolean isSorted = true;

            for (int j = 0; j < this.arr.length - i - 1; j++) {
                if (this.arr[j] > this.arr[j + 1]) {
                    isSorted = false;

                    int bigger = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = bigger;
                }
            }

            if (isSorted) {
                return this.arr;
            }
        }

        return this.arr;
    }

    public int[] quickSort() {
        return quickSort(0, this.arr.length - 1);
    }

    public Node mergeSort(Node head) {
        if (head ==  null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node afterMiddle = middle.next;
        middle.next = null;
        Node leftNode = mergeSort(head);
        Node rightNode = mergeSort(afterMiddle);

        return merge(leftNode, rightNode);
    }

    private Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node leftNode, Node rightNode) {
        Node newHead = new Node(-1, null);
        Node tail = newHead;

        while (leftNode != null && rightNode != null) {
            if (leftNode.value < rightNode.value) {
                tail.next = leftNode;
                leftNode = leftNode.next;
            } else {
                tail.next = rightNode;
                rightNode = rightNode.next;
            }

            tail = tail.next;
        }

        if (leftNode != null) {
            tail.next = leftNode;
        } else {
            tail.next = rightNode;
        }

        return newHead.next;
    }

    private int[] quickSort(int left, int right) {
        if (left < right) {
            int partition = partitions(this.arr, left, right);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }

        return this.arr;
    }
    
    private int partitions(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int bigger = arr[i];
                arr[i] = arr[j];
                arr[j] = bigger;
            }
        }

        int bigger = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = bigger;

        return i + 1;
    }
}
