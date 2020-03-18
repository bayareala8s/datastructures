package com.bayareala8s.BinarySearchTree;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int choice, x;

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("1. Display Tree");
            System.out.println("2. Search");
            System.out.println("3. Insert a new node");
            System.out.println("4. Delete a node");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Inorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("8. Height of tree");
            System.out.println("9. Find Minimum key");
            System.out.println("10. Find Maximum Key");
            System.out.println("11. Size of tree");
            System.out.println("12. Quit");
            System.out.println("Enter your choice: ");

            choice = scan.nextInt();

            if (choice == 13)
                break;

            switch (choice) {

                case 1:
                    bst.display(0);
                    break;
                case 2:
                    System.out.println("Enter the key to be searched: ");
                    x = scan.nextInt();
                    if (bst.searchIterative(x))
                        System.out.println("Key found");
                    else
                        System.out.println("Key not found");
                    break;
                case 3:
                    System.out.println("Enter the key to be inserted: ");
                    x = scan.nextInt();
                    //bst.insertIterative(x);
                    bst.insertRecursive(x);
                    break;
                case 4:
                    System.out.println("Enter the key to be deleted: ");
                    x = scan.nextInt();
                    //bst.delete(x);
                case 5:
                    bst.preOrder();
                    break;
                case 6:
                    bst.inOrder();
                    break;
                case 7:
                    bst.postOrder();
                    break;
                case 8:
                    System.out.println("Height of tree is " + bst.height());
                    break;
                case 9:
                    try {
                        System.out.println("Minimum key is " + bst.minIterative());
                    }
                    catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Maximum key is " + bst.maxIterative());
                    }
                    catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 11:
                    System.out.println("Size of tree is " + bst.size());
                    break;
                case 12:
                    System.out.println("Enter the kth position for smallest element");
                    int k = scan.nextInt();
                    System.out.println("Smallest element of tree at " + k + bst.getKthSmallestElement(k));
                    break;

            }
        }
    }
}


