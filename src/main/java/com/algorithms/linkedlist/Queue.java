package com.algorithms.linkedlist;

/**
 * @author charan
 * enQueue : adds node to the end of the queue
 * deQueue : removes node from the top of the queue.
 * isEmpty
 * peek(): Return the top element.
 */
public class Queue<T> {

    LinkedList<T> queueLinkedList = new LinkedList<>();

    public void enQueue(Node node) {
        queueLinkedList.addAtToEnd(node);
    }

    public boolean isEmpty() {
        return queueLinkedList.isEmpty();
    }

    public Node deQueue() {
        return queueLinkedList.removeAtToTop();
    }

    public Node peek() {
        return queueLinkedList.getHeadNode();
    }
}
