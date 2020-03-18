package com.bayareala8s.BinarySearchTree;

import java.lang.NullPointerException;

public class BinarySearchTree implements Tree {

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

        System.out.println(p.info + " "); // NLR
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
        System.out.println(p.info + " ");
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

    public void insertIterative(int info)
    {
        Node p = root;
        Node parent = null;

        while(p != null)
        {
            parent = p;
            if(info < p.info)  // move to left child
                p = p.lChild;

            else if (info > p.info)  // move to right child
                p = p.rChild;

            else
            {
                System.out.println(info + "already present in the tree");
                return;
            }
        }

        Node temp = new Node(info);

        if(parent == null) // tree is empty
            root = temp;
        else if (info < parent.info)
            parent.lChild = temp;
        else if (info > parent.info)
            parent.rChild = temp;
    }

    public void insertRecursive(int info)
    {
        root = insert(root, info);
    }

    private Node insert(Node p, int info)
    {
        if(p == null)
        {
            p = new Node(info);
        }
        else if(info < p.info) // move to left subtree
            p.lChild = insert(p.lChild, info); // return becomes left child

        else if (info > p.info) // move to right subtree
            p.rChild = insert(p.rChild, info);

        else
            System.out.println(info + " already present in tree");

        return p;
    }

    public boolean searchIterative(int info)
    {
        Node p = root;

        while(p != null)
        {
            if(info < p.info)  //move to left child
                p = p.lChild;

            else if (info > p.info)
                p= p.rChild; //move to right child

            else
                return true;
        }

        return false; // p is null
    }

    public boolean searchRecursive(int info)
    {
        return (search(root, info) != null);
    }

    private Node search(Node root, int info)
    {
        Node p = root;

        //base case
        if(p == null)
            return null;

        if(info < p.info) // move to left subtree
            return search(p.lChild, info);

        if(info > p.info) // move to right child
            return search(p.rChild, info);

        return p; // key found
    }

    public int minIterative() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        Node p = root;

        while(p.lChild != null) // reference to last node -> left child
            p = p.lChild;

        return p.info;
    }

    public int maxIterative() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        Node p = root;

        while(p.rChild != null) // reference to last node -> right child
            p = p.rChild;

        return p.info;
    }

    public int minRecursive() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        return min(root).info;
    }

    public Node min(Node root)
    {
        Node p = root;

        //base case
        if(p.lChild == null)
            return p; // reference to last left node
        return min(p.lChild);
    }

    public int maxRecursive() throws Exception
    {
        if(isEmpty())
            throw new Exception("Tree is empty");

        return max(root).info;
    }

    public Node max(Node root)
    {
        Node p = root;

        if(p.rChild == null)
            return p; // reference to last right node
        return max(p.rChild);
    }

    public void display(int traversal) {

        switch(traversal) {
            case 0:
                preOrder();
                break;
            case 1:
                inOrder();
                break;
            default:
                postOrder();
                break;
        }


    }

    @Override
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

    public Node getKthSmallestElement(int k) {

        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }

        return getKthSmallestElement(root, k);
    }

    private Node getKthSmallestElement(Node root, int k) {

        //number of nodes in the left subtree
        //+1 because we count the root node of the subtree as well
        int lsize = size(root.lChild) + 1;

        //this is when we find the kth smallest item
        if(lsize == k) {
            return root;
        }

        //if the number of nodes in the left subtree > k-th smallest item
        //it means the k-th smallest item is in the left subtree
        if(lsize > k)
            return getKthSmallestElement(root.lChild, k);

        //if the number of nodes in the left subtree is smaller then the k-th
        //smallest item then we can discard the left subtree and consider the
        //right substree
        //NOW WE ARE NOT LOOKING FOR THE K-TH BUT THE K-Nth SMALLEST ITEM
        if(lsize < k)
            return getKthSmallestElement(root.lChild, k - lsize);

        return null;
    }

}
