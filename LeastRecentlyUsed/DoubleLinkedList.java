package com.bayareala8s.LeastRecentlyUsed;

import java.util.Scanner;

public class DoubleLinkedList {

    private Node start; //reference to first node of the list

    public DoubleLinkedList() {

        start = null;
    }

    public void displayList() {

        Node p;

        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List is :  ");

        p = start;  // p points to start of list

        while(p != null) {
            System.out.print(p + "<->");
            p = p.next; // p will point to next element in the list
        }
        System.out.println();
    }

    public void insertInBeginning(int id, String data) {

        if(start == null) {
            insertInEmptyList(id, data);
            return;
        }

        Node temp = new Node(id, data);
        temp.next = start;
        start.prev = temp;
        start = temp;

    }

    public void insertInEmptyList(int id, String data) {

        Node temp = new Node(id, data);
        start = temp;
    }

    public void insertAtEnd(int id, String data) {

        Node temp = new Node(id, data);
        Node p = start;
        while(p.next != null) { //reference to last node of the list
            p = p.next;
        }
        p.next = temp;
        temp.prev = p;
    }

    public void insertAfter(int id, String data, String x) {
        Node temp = new Node(id, data);
        Node p = start;

        while(p!= null) {    //reference to node that contains x
            if(p.info == x)
                break;
            p = p.next;
        }

        if(p == null)
            System.out.println(x + " not present in the list");
        else {
            temp.prev = p;
            temp.next = p.next;
            if(p.next != null)
                p.next.prev = temp; //Should not be done when p refers to last node
            p.next = temp;
        }
    }

    public void insertBefore(int id, String data, String x) {
        if(start == null) {
            System.out.println("List is empty");
            return;
        }

        if(start.info == x) {
            Node temp = new Node(id, data);
            temp.next = start;
            start.prev = temp;
            start = temp;
            return;
        }

        Node p = start;
        while(p!=null) {
            if(p.info == x)
                break;
            p=p.next;
        }

        if(p==null)
            System.out.println(x + " not present in the list");

        else {
            Node temp = new Node(id, data);
            temp.prev = p.prev;
            temp.next = p;
            p.prev.next = temp;
            p.prev = temp;
        }
    }

    public void deleteFirstNode() {
        if(start == null)  // list is empty
            return;

        if(start.next == null) { // list has only one Node
            start = null;
            return;
        }
        start = start.next;
        start.prev = null;

    }

    public void deleteLastNode() {
        if(start == null)  // list is empty
            return;

        if(start.next == null) { // list has only one Node
            start = null;
            return;
        }

        Node p = start;
        while(p.next != null)
            p=p.next;
        p.prev.next = null;
    }

    public void deleteNode(String x) {
        if(start == null) // list is empty
            return;

        if(start.next == null) {  // list has only one Node
            if(start.info==x)
                start = null;
            else
                System.out.println(x + " not found");
            return;
        }

        if(start.info == x) {  // Deletion of first Node
            start = start.next;
            start.prev = null;
            return;
        }

        Node p = start.next;
        while(p.next != null) {
            if(p.info == x)
                break;
            p = p.next;
        }

        if(p.next != null) { // Node to be deleted is in between
            p.prev.next = p.next;
            p.next.prev = p.prev;
        }
        else {  // p refers to last Node
            if(p.info == x) // Node to be deleted is last Node
                p.prev.next = null;
            else
                System.out.println(x + " not found");
        }
    }

    public void reverseList() {
        if(start == null)
            return;

        Node p1 = start;
        Node p2 = p1.next;
        p1.next = null;
        p1.prev = p2;
        while(p2!= null) {
            p2.prev = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p2.prev;
        }

        start = p1;
    }
}
