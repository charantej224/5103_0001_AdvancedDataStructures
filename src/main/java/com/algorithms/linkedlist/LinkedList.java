package com.algorithms.linkedlist;

public class LinkedList<T> {

    Node<T> headNode;
    Node<T> tailNode;
    int counter;

    public boolean isEmpty(){
        boolean isEmpty = counter == 0 ? true : false;
        return isEmpty;
    }

    public void addAtToEnd(Node<T> node) {
        if (counter == 0) {
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNode(node);
            tailNode = node;
        }
        counter++;
    }

    public void addAtToTop(Node<T> node) {
        if (counter == 0) {
            headNode = node;
            tailNode = node;
        } else {
            node.setNode(headNode);
            headNode = node;
        }
        counter++;
    }

    public Node removeAtToEnd() {
        Node returnNode = null;
        if (counter == 0) {
            throw new RuntimeException("nothing to remove");
        } else {
            Node tempNode = headNode;
            while (null != tempNode.getNode()) {
                if (tempNode.getNode() == tailNode) {
                    returnNode = tempNode.deepClone();
                    tempNode.setNode(null);
                    counter--;
                }
                tempNode = tempNode.getNode();
            }
        }
        return returnNode;
    }

    public Node removeAtToTop() {
        Node tempNode;
        if (counter == 0) {
            throw new RuntimeException("nothing to remove");
        } else {
            tempNode = headNode.deepClone();
            headNode = headNode.getNode();
            counter--;
        }
        return tempNode;
    }

    @Override
    public String toString() {
        String value = "";
        Node<T> temp = headNode;
        if (headNode == tailNode) {
            value = value + headNode.getNode().getT().toString();
        } else {
            while (temp.getNode() != tailNode) {
                value = value + temp.getNode().getT().toString();
                temp = temp.getNode();
            }
        }
        return value;
    }

    public Node<T> getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node<T> headNode) {
        this.headNode = headNode;
    }

    public Node<T> getTailNode() {
        return tailNode;
    }

    public void setTailNode(Node<T> tailNode) {
        this.tailNode = tailNode;
    }
}