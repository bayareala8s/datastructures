package com.bayareala8s.sort;

public class BinaryTreeSort {

    public BinaryTreeSort() {

    }

    public void sort(int[] a, int n) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        for(int i=0;i<n;i++)
            binarySearchTree.insert(a[i]);

        binarySearchTree.inOrder(a);

    }


}
