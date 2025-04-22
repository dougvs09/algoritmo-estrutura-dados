package stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.printf("Head: %d", stack.getHead().getValue());
        System.out.printf("%nSize: %d", stack.size());

        Integer poppedElement = stack.pop();

        System.out.printf("%nPopped element: %d", poppedElement);
        System.out.printf("%nHead: %d", stack.getHead().getValue());
        System.out.printf("%nSize: %d", stack.size());

        Integer peekedElement = stack.peek();

        System.out.printf("%nPeeked element: %d", peekedElement);
        System.out.printf("%nHead: %d", stack.getHead().getValue());
        System.out.printf("%nSize: %d", stack.size());
    }
}