package linked_list;

public class LinkedListNode<T> {

    private final T value;
    private LinkedListNode<T> previous;
    private LinkedListNode<T> next;

    public LinkedListNode(T value) {
        this.next = null;
        this.previous = null;
        this.value = value;
    }

    public LinkedListNode<T> getPrevious() {
        return this.previous;
    }

    public LinkedListNode<T> getNext() {
        return this.next;
    }

    public T getValue() {
        return this.value;
    }

    public void setNext(LinkedListNode<T> value) {
        this.next = value;
    }

    public void setPrevious(LinkedListNode<T> value) {
        this.previous = value;
    }
}
