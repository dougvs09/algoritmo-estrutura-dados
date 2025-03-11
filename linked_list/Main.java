package linked_list;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addToInit(1);
        doublyLinkedList.addToEnd(32);
        logger.log(INFO, "First head: {0}", doublyLinkedList.getHead().getValue());
        logger.log(INFO, "First tail: {0}", doublyLinkedList.getTail().getValue());
        logger.log(INFO, "Tail previous: {0}", doublyLinkedList.getTail().getPrevious().getValue());
        logger.log(INFO, "Head next: {0}", doublyLinkedList.getHead().getNext().getValue());

        doublyLinkedList.addToInit(91);
        logger.log(INFO, "New head: {0}", doublyLinkedList.getHead().getValue());
        logger.log(INFO, "New next head: {0}", doublyLinkedList.getHead().getNext().getValue());
        logger.log(INFO, "New previous of new head next: {0}", doublyLinkedList.getHead().getNext().getPrevious().getValue());
        logger.log(INFO, "Tail previous: {0}", doublyLinkedList.getTail().getPrevious().getValue());

        doublyLinkedList.removeFromEnd();
        logger.log(INFO, "New tail: {0}", doublyLinkedList.getTail().getValue());

        doublyLinkedList.addToEnd(4334);
        logger.log(INFO, "New tail: {0}", doublyLinkedList.getTail().getValue());
    }
}