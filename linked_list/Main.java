package linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addToInit(1);
        doublyLinkedList.addToEnd(32);
        System.out.printf("First head: %s", doublyLinkedList.getHead().getValue());
        System.out.printf("First head: %s", doublyLinkedList.getHead().getValue());
        System.out.printf("First tail: %s", doublyLinkedList.getTail().getValue());
        System.out.printf("Tail previous: %s", doublyLinkedList.getTail().getPrevious().getValue());
        System.out.printf("Head next: %s", doublyLinkedList.getHead().getNext().getValue());

        doublyLinkedList.addToInit(91);
        System.out.printf("New head: %s", doublyLinkedList.getHead().getValue());
        System.out.printf("New next head: %s", doublyLinkedList.getHead().getNext().getValue());
        System.out.printf("New previous of new head next: %s", doublyLinkedList.getHead().getNext().getPrevious().getValue());
        System.out.printf("Tail previous: %s", doublyLinkedList.getTail().getPrevious().getValue());

        doublyLinkedList.removeFromEnd();
        System.out.printf("New tail: %s", doublyLinkedList.getTail().getValue());

        doublyLinkedList.addToEnd(4334);
        System.out.printf("New tail: %s", doublyLinkedList.getTail().getValue());
    }
}