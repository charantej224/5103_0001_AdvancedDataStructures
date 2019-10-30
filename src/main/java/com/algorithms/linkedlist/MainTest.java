package com.algorithms.linkedlist;

public class MainTest {

    public static void main(String[] args){
        System.out.println("initialising two elements to test the nature of data structures");
        Stack<Integer> stack = new Stack();
        Node<Integer> node1 = new Node();
        node1.setT(120);
        Node<Integer> node2 = new Node();
        node2.setT(240);

        System.out.println("Stack : Setting up elements " + node1 + " " + node2);
        stack.push(node1);
        stack.push(node2);
        System.out.println("Stack : peek for next element to be popped ");
        System.out.println(stack.peek());
        System.out.println("Stack : pop element1");
        System.out.println(stack.pop());
        System.out.println("Stack : pop element2 ");
        System.out.println(stack.pop());

        Queue<Integer> queue = new Queue<Integer>();
        System.out.println("Queue : Setting up elements " + node1 + " " + node2);
        queue.enQueue(node1);
        queue.enQueue(node2);
        System.out.println("Stack : peek for next element to be popped ");
        System.out.println(queue.peek());
        System.out.println("Stack : deQueue element1");
        System.out.println(queue.deQueue());
        System.out.println("Stack : deQueue element2 ");
        System.out.println(queue.deQueue());
    }
}
