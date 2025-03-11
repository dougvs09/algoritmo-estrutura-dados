package linked_list;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addToInit(1);
        doublyLinkedList.addToEnd(32);
        logger.info("First head: " + doublyLinkedList.getHead().getValue());
        logger.info("First tail: " + doublyLinkedList.getTail().getValue());
        logger.info("Tail previous: " + doublyLinkedList.getTail().getPrevious().getValue());
        logger.info("Head next: " + doublyLinkedList.getHead().getNext().getValue());

        doublyLinkedList.addToInit(91);
        logger.info("New head: " + doublyLinkedList.getHead().getValue());
        logger.info("New next head: " + doublyLinkedList.getHead().getNext().getValue());
        logger.info("New previous of new head next: " + doublyLinkedList.getHead().getNext().getPrevious().getValue());
        logger.info("Tail previous: " + doublyLinkedList.getTail().getPrevious().getValue());

        doublyLinkedList.removeFromEnd();
        logger.info("New tail: " + doublyLinkedList.getTail().getValue());

        doublyLinkedList.addToEnd(4334);
        logger.info("New tail: " + doublyLinkedList.getTail().getValue());
    }
}