package com.algorithms.linkedlist;

/**
 * @author charan
 * push() : Insert the element into linked list nothing but which is the top node of Stack.
 * pop() : Return top element from the Stack and move the top pointer to the second node of linked list or Stack.
 * peek(): Return the top element.
 * display(): Print all element of Stack.
 */
public class Stack<T> {
    LinkedList<T> stackLinkedList = new LinkedList<>();

    public void push(Node node) {
        stackLinkedList.addAtToTop(node);
    }

    public boolean isEmpty() {
        return stackLinkedList.isEmpty();
    }

    public Node pop() {
        return stackLinkedList.removeAtToTop();
    }

    public Node peek() {
        return stackLinkedList.getHeadNode();
    }

}
