package linked_list;

public class DoublyLinkedList<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public LinkedListNode<T> addToInit(T value) {
        LinkedListNode<T> node = new LinkedListNode<>(value);

        if (this.head != null) {
            this.head.setPrevious(node);
            node.setNext(this.head);

            this.head = node;

            if (this.tail == null) {
                this.tail = this.head;
            }
        } else {
            this.head = node;

            if (this.tail != null) {
                this.tail.setPrevious(node);
                this.head.setNext(this.tail);
            }
        }

        return node;
    }

    public LinkedListNode<T> addToEnd(T value) {
        LinkedListNode<T> node = new LinkedListNode<>(value);

        if (this.tail != null) {
            this.tail.setNext(node);
            node.setPrevious(this.tail);

            this.tail = node;

            if (this.head == null) {
                this.head = this.tail;
            }
        } else {
            this.tail = node;

            if (this.head != null) {
                this.head.setNext(node);
                this.tail.setPrevious(this.head);
            }
        }

        return node;
    }

    public void removeFromInit() {
        this.head = this.head.getNext();
        this.head.setPrevious(null);
    }

    public void removeFromEnd() {
        this.tail = this.tail.getPrevious();
        this.tail.setNext(null);
    }

    public LinkedListNode<T> getHead() {
        return this.head;
    }

    public LinkedListNode<T> getTail() {
        return this.tail;
    }
}
