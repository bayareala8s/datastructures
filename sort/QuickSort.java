package com.bayareala8s.sort;

//Best case O(nlog(n))
//Worst case O(n2)
//Unstable sort
//Space complexity O(log(n))
public class QuickSort {

    public QuickSort() {

    }
    public void sort(int[] a, int n) {

        sort(a,0, n-1);
    }

    private static void sort(int a[], int low, int up) {

        if(low >= up) //zero or one element in sublist
            return;
        int p = partition(a, low, up);
        sort(a,low,p-1); //sort left sublist
        sort(a,p+1,up); //sort right sublist
    }

    private static int partition(int[] a, int low, int up) {

        int temp;
        int i;
        int j;
        int pivot;

        pivot=a[low];

        i = low+1; //moves from left to right
        j = up; //moves from right to left

        while(i<=j) {

            while(a[i] < pivot && i < up)
                i++;

            while(a[j] > pivot)
                j--;

            if(i<j) { //swap a[i] and a[j]
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            else //found proper place for pivot
                break;
        }

        //proper place for pivot is j
        a[low] = a[j];
        a[j] = pivot;

        return j;
    }
}
