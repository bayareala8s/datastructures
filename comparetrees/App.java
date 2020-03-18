package com.bayareala8s.comparetrees;

public class App {

    public static void main(String[] args) {

        BinarySearchTree bst1 = new BinarySearchTree();

        bst1.insertIterative(32);
        bst1.insertIterative(25);
        bst1.insertIterative(78);
        bst1.insertIterative(10);
        bst1.insertIterative(40);

        System.out.println("Pre-Order Traversal");
        bst1.display(0);

        BinarySearchTree bst2 = new BinarySearchTree();

        bst2.insertIterative(32);
        bst2.insertIterative(25);
        bst2.insertIterative(78);
        bst2.insertIterative(10);
        bst2.insertIterative(40);

        bst2.display(0);

        TreeCompareHelper helper = new TreeCompareHelper();
        System.out.println(helper.compareTrees(bst1.root, bst2.root));
    }
}
