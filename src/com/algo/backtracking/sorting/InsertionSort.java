package com.algo.backtracking.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    private void insertionSort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            int red = i - 1;
            while (red >= 0 && ints[red] > temp) {
                ints[red + 1] = ints[red];
                red--;
            }
            ints[red + 1] = temp;
        }

        // 0 to red your array size



        for (int j = 0; j < ints.length; j++) {
            System.out.println(ints[j]);
        }
    }
}
