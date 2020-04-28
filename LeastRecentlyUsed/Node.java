package com.bayareala8s.LeastRecentlyUsed;

public class Node {

    public Node prev; //reference to previous node
    private int id;
    public String info;  // data
    public Node next; //reference to next node


    public Node(int id, String info) {
        this.prev = null;
        this.id = id;
        this.info = info;
        this.next = null;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.id+"-"+this.info;
    }
}
