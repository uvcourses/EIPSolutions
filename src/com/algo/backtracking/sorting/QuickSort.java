package com.algo.backtracking.sorting;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int input[] = new int[]{5, 4, 3, 2, 1};
        quickSort.quickSort(input, 0, input.length - 1);
    }

    private void quickSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp[] = new int[(end - start) + 1];
        //int pivot = a[start];
        int smaller = start;
        for (int bigger = start + 1; bigger <= end; bigger++) {
            if (a[bigger] < a[start]) {
                smaller++;
                swap(a, temp, smaller, bigger);
            }else {

            }
        }
        swap(a, temp,start, smaller);

        for (int i = start; i < end; i++) {
            a[i] = a[i-start];
        }

        quickSort(a, start, smaller - 1);
        quickSort(a, smaller + 1, end);
    }


    private void swap(int a[], int temp[],int source, int end) {
         temp[source]=temp[source];
        a[source] = a[end];
      //  a[end] = temp;
    }
}
