package com.bayareala8s.Search;

public class BinarySearch {


    //O(N) complexity
    public int LinearSearch(int[] sortedArray, int number) {

        //Loop through the sorted array to get position
        for(int i = 0; i < sortedArray.length; i++) {

            if (sortedArray[i] == number) {
                return i;
            }
        }
        return -1;

    }

    public int BinarySearch(int[] sortedArray, int number) {

        return BinarySearchRecursion(sortedArray, number, 0, sortedArray.length - 1);

    }

    // O(log n) complexity
    private int BinarySearchRecursion(int[] sortedArray, int number, int first, int last) {

        if (first > last)
            return -1;

        //Mid of the array
        int mid = (first + last) / 2;

        if (number == sortedArray[mid])
            return mid;

        // search in left half
        if(number < sortedArray[mid]) {

            return BinarySearchRecursion(sortedArray, number,first, mid - 1);
        }

        // search in right half
        if(number > sortedArray[mid]) {

            return BinarySearchRecursion(sortedArray, number,mid + 1, last);
        }

        return -1;

    }

}
