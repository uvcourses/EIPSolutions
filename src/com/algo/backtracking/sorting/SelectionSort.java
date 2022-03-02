package com.algo.backtracking.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sorting(new int[]{1, 2, 3, 4, 5, 6});
    }

    private void sorting(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    min = Math.min(min, input[j]);
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);
        }
        for (int j:input){
            System.out.println(j);
        }
    }

    private void swap(int[] input, int s, int t) {
        int temp = input[s];
        input[s] = input[t];
        input[t] = temp;
    }
}
