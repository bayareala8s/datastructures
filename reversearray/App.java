package com.bayareala8s.reversearray;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int[] unsortedArray;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array :");
        size = scan.nextInt();
        unsortedArray = new int[size];
        for(int i = 0; i < unsortedArray.length ; i++) {
            System.out.print("Enter number :");
            unsortedArray[i] = scan.nextInt();
        }

        ReverseArray reverseArray = new ReverseArray();

        int[] reversedArray = reverseArray.reverseArray(unsortedArray);

        for(int i=0; i<reversedArray.length; i++) {
            System.out.print(reversedArray[i]+" ");
        }
    }
}
