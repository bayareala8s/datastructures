package com.bayareala8s.BinarySearchTree;

import java.lang.NullPointerException;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean isEmpty() {

        if(root == null)
            return true;
        else
            return false;
    }

    public void preOrder()
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return;
        }

        preOrder(root);
    }

    private void preOrder(Node p)
    {
        //base case
        if(p==null)
            return;

        System.out.print(p.info + " "); // NLR
        preOrder(p.lChild);
        preOrder(p.rChild);
    }

    public void inOrder()
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return;
        }

        inOrder(root);
    }

    private void inOrder(Node p)
    {
        if(p==null)
            return;

        inOrder(p.lChild); // LNR
        System.out.print(p.info + " ");
        inOrder(p.rChild);
    }

    public void postOrder()        // LRN
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return;
        }

        postOrder(root);
    }

    private void postOrder(Node p)
    {
        if(p==null)
            return;

        postOrder(p.lChild);
        postOrder(p.rChild);
        System.out.print(p.info + " ");

    }

    public int height()
    {
        return height(root);
    }

    private int height(Node root)
    {
        if(root == null)
        {
            System.out.println("Tree is empty");
            return -1;
        }

        Node p = root;
        int hL = height(p.lChild);
        int hR = height(p.rChild);

        if(hL > hR)
            return 1 + hL;
        else
            return 1 + hR;
    }

    //1. Run time is O(h), where h is the height of the tree
    public void insert(int x)
    {
        root = insert(root, x);
    }

    //1. Terminating conditions p == null or x == p.info
    private Node insert(Node p, int x)
    {
        if(p == null)
            p = new Node(x);

        else if(x < p.info) // move to left subtree
            p.lChild = insert(p.lChild, x); // return becomes left child

        else if (x > p.info) // move to right subtree
            p.rChild = insert(p.rChild, x);

        else
            System.out.println(x + " already present in tree");

        return p;
    }


    //1. Run time is O(h), where h is the height of the tree
    public boolean search(int x)
    {
        return (search(root, x) != null);
    }

    //1. x is the key to be searched
    //2. Start at the root node and move down the tree
    //3. if x is equal to the key in the current node - Search is successful
    //4. if x is less than the key in the current node - Move to left child
    //5. if x is greater than the key in the current node - Move to right child
    //6. if we reach a NULL left child or NULL right child - Search is unsuccessful
    private Node search(Node root, int x)
    {
        //base case
        if(root == null)
            return null; //Key not found

        Node p = root;

        if(x < p.info) // move to left subtree
            return search(p.lChild, x);

        if(x > p.info) // move to right child
            return search(p.rChild, x);

        return p; // key found
    }

    public void delete(int x) {
        root = delete(root, x);
    }

    private Node delete(Node p, int x) {

        Node child, successor;

        if(p == null) {
            System.out.println(x + " not found");
            return p;
        }

        if(x < p.info) //delete from left subtree
            p.lChild = delete(p.lChild, x);

        else if(x > p.info) //delete from right subtree
            p.rChild = delete(p.rChild,x);

        else { //key to be deleted is found

            if(p.lChild != null & p.rChild != null) { //2 children case

                successor = p.rChild;
                while(successor.lChild != null)
                    successor = successor.lChild;

                p.info = successor.info;
                p.rChild = delete(p.rChild, successor.info);
            }
            else { //1 child or no child

                if(p.lChild != null) //only left child
                    child = p.lChild;
                else
                    child = p.rChild;

                p = child;
            }
        }
        return p;
    }

    //1. Node with smallest key
    //2. Last node in the leftmost path starting from root
    public int min() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        return min(root).info;
    }

    private Node min(Node root)
    {
        Node p = root;

        //base case
        if(p.lChild == null)
            return p; // reference to last left node

        return min(p.lChild);
    }

    //1. Node with largest key
    //2. Last node in the rightmost path starting from root
    public int max() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        return max(root).info;
    }

    private Node max(Node root)
    {
        Node p = root;

        if(p.rChild == null)
            return p; // reference to last right node

        return max(p.rChild);
    }

    public void display() {

        display(root, 0);
        System.out.println();

    }

    private void display(Node root, int level) {

        int i;

        if(root == null)
            return;

        Node p = root;

        display(p.rChild, level + 1);
        System.out.println();

        for(i = 0; i<level;i++) {
            System.out.print("     ");
        }

        System.out.print(p.info);

        display(p.lChild, level + 1);
    }


    public int size() {

        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        }

        return size(root);

    }

    private int size(Node root) {

        if (root == null) {
            return 0;
        }

        Node p = root;

        return (size(p.lChild) + size(p.rChild) + 1);
    }
}
