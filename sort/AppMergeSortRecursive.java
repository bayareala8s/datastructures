package com.bayareala8s.sort;

import java.util.Scanner;

public class AppMergeSortRecursive {

    public static void main(String[] args) {

        int i,n;
        int[] a = new int[20];
        MergeSortRecursive mergeSort = new MergeSortRecursive();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();

        for(i = 0;i < n;i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }

        mergeSort.sort(a, n);

        System.out.println("Sorted array is : ");

        for(i = 0;i < n;i++)
            System.out.print(a[i] + " ");

        System.out.println();
        scan.close();

        System.out.println("Time Complexity : o(n2) ");
        System.out.println("Stable Sort");
        System.out.println("In-Place Sort : Place Complexity o(1)");
        System.out.println("Efficient when n is small");
    }
}
