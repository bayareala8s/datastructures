package com.bayareala8s.CompareTrees;

public class Node {

    public int info;
    public Node lChild;
    public Node rChild;

    public Node(int info)
    {
        this.info = info;
        lChild = null;
        rChild = null;
    }
}