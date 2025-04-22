package stack;

public class StackNode<T> {

    private final T value;
    private StackNode<T> next;

    public StackNode(T value) {
        this.next = null;
        this.value = value;
    }
    public StackNode<T> getNext() {
        return this.next;
    }

    public T getValue() {
        return this.value;
    }

    public void setNext(StackNode<T> value) {
        this.next = value;
    }
}
