package com.bayareala8s.BinarySearchTree;

public interface Tree {

    public boolean isEmpty();
    public void preOrder();
    public void inOrder();
    public void postOrder();
    public int height();
    public void insertIterative(int info);
    public void insertRecursive(int info);
    public boolean searchIterative(int info);
    public boolean searchRecursive(int info);
    public int minIterative() throws Exception;
    public int minRecursive() throws Exception;
    public int maxIterative() throws Exception;
    public int maxRecursive() throws Exception;
    public void display(int traversal);
    public int size();
    public Node getKthSmallestElement(int k);


}
