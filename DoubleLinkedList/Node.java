package com.bayareala8s.DoubleLinkedList;

public class Node {

    public Node prev; //reference to previous node
    public int info;  // data
    public Node next; //reference to next node


    public Node(int info) {
        this.prev = null;
        this.info = info;
        this.next = null;
    }
}
