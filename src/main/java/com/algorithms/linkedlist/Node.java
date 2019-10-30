package com.algorithms.linkedlist;

public class Node<T> {

    private T t;
    private Node<T> node;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    public Node deepClone(){
        Node node = new Node();
        node.setT(t);
        return node;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
