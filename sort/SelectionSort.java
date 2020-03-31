package com.bayareala8s.sort;

public class SelectionSort {

    public void sort(int[] a, int n) {

        int minIndex, temp,i,j;

        for(i=0;i<n-1; i++) {

            minIndex = i;
            for(j=i+1; j<n; j++) {

                if(a[j] < a[minIndex])
                    minIndex = j;

            }
            if(i != minIndex) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
