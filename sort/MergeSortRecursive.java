package com.bayareala8s.sort;

public class MergeSortRecursive {

    public MergeSortRecursive() {

    }

    public static void sort(int a[], int n) {

        int[] temp = new int[n];

        sort(a, temp,0,n-1);
    }

    private static void sort(int[] a, int[] temp, int low, int up) {

        if(low==up) //only one element
            return;

        int mid = (low+up) / 2;

        sort(a, temp, low, mid); //sort a[low]...a[mid]
        sort(a, temp, mid+1, up); //sort a[mid+1]....a[up]

        //Merge a[low]...a[mid] and a[mid+1] ...a[up] to temp[low]...temp[up]
        merge(a, temp, low, mid, mid+1, up);

        //Copy temp[low]...temp[up] to a[low]...a[up]
        copy(a,temp,low,up);
    }

    /* a[low1] ... a[up1] and a[low2]...a[up2] merged to temp[low1]...temp[up2] */
    public static void merge(int[] a,int[] temp, int low1, int up1, int low2, int up2) {

        int i=low1;
        int j=low2;
        int k=low1;

        while( (i<= up1) && (j <= up2)) {
            if(a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        /*copy remaining elements of a1, array a2 finished */
        while(i<=up1)
            temp[k++] = a[i++];

        /*copy remaining elements of a2, array a1 finished */
        while(j<=up2)
            temp[k++] = a[j++];

    }

    //copies temp[low]...temp[up] to a[low]...a[up]
    private static void copy(int[] a, int[] temp, int low, int up) {

        for(int i=low; i<= up; i++)
            a[i] = temp[i];
    }
}
