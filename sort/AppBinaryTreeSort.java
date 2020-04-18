package com.bayareala8s.sort;

import java.util.Scanner;

public class AppBinaryTreeSort {

    public static void main(String[] args) {

        int i,n;
        int[] a = new int[20];
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();

        for(i = 0;i < n;i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }

        binaryTreeSort.sort(a, n);

        System.out.println("Sorted array is : ");

        for(i = 0;i < n;i++)
            System.out.print(a[i] + " ");

        System.out.println();
        scan.close();

        System.out.println("Time Complexity : O(nlogn) ");
        System.out.println("Stable Sort");
        System.out.println("Not an In-Place Sort");
        System.out.println("Can use Threaded Binary Search Tree for improving performance");
    }
}

/*
Enter the number of elements : 6
Enter element 1 : 6
Enter element 2 : 3
Enter element 3 : 1
Enter element 4 : 5
Enter element 5 : 9
Enter element 6 : 8
Sorted array is :
1 3 5 6 8 9
Time Complexity : O(nlogn)
Stable Sort
Not an In-Place Sort
Can use Threaded Binary Search Tree for improving performance

Process finished with exit code 0

 */