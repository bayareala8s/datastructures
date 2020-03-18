package com.bayareala8s.Search;

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int size;
        int[] sortedArray;
        int number;

        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice for search : ");

        BinarySearch binarySearch;
        int position;

        while(true) {

            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Quit");

            choice = scan.nextInt();

            if(choice == 3)
                break;

            switch(choice) {
                case 1:
                    System.out.print("Enter size of array :");
                    size = scan.nextInt();
                    sortedArray = new int[size];
                    for(int i = 0; i < sortedArray.length ; i++) {
                        System.out.print("Enter number :");
                        sortedArray[i] = scan.nextInt();
                    }
                    System.out.print("Enter number to search in an array :");
                    number = scan.nextInt();

                    binarySearch = new BinarySearch();

                    position = binarySearch.LinearSearch(sortedArray, number);

                    if(position != -1)
                        System.out.println("Number " + number + " found at position: " + position);
                    else
                        System.out.println("Number " + number + " not found");

                    break;

                case 2:
                    System.out.print("Enter size of array :");
                    size = scan.nextInt();
                    sortedArray = new int[size];
                    for(int i = 0; i < sortedArray.length ; i++) {
                        System.out.print("Enter number :");
                        sortedArray[i] = scan.nextInt();
                    }
                    System.out.print("Enter number to search in an array :");
                    number = scan.nextInt();

                    binarySearch = new BinarySearch();

                    position = binarySearch.BinarySearch(sortedArray, number);

                    if(position != -1)
                        System.out.println("Number " + number + " found at position: " + position);
                    else
                        System.out.println("Number " + number + " not found");

                    break;

            }

        }
        scan.close();

    }

}
