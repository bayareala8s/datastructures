package com.bayareala8s.sort;

public class InsertionSort {

    public void sort(int[] a, int n) {

        int temp,i,j;

        //0 to i - 1 sorted part
        //i to n - 1 unsorted part
        for(i = 1; i < n; i++) {

            //first element of unsorted part
            temp = a[i];

            //scanning begins from end of sorted part
            for(j = i - 1; j >= 0 && a[j] > temp; j--)
                a[j+1] = a[j]; //shifts elements to right

            a[j+1] = temp;
        }
    }
}
