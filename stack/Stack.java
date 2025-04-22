package stack;

public class Stack<T> {
    private StackNode<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public T push(T element) {
        StackNode<T> newStackNode = new StackNode<>(element);
        newStackNode.setNext(this.head);
        this.head = newStackNode;
        this.size++;
        return element;
    }

    public T pop() {
        if (this.isEmpty()) {
           throw new IndexOutOfBoundsException("The stack is empty");
        }
        StackNode<T> removedElement = this.head;
        this.head = removedElement.getNext();
        this.size--;
        return removedElement.getValue();
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty");
        }

        return this.head.getValue();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.size;
    }

    public StackNode<T> getHead() {
        return head;
    }
}
