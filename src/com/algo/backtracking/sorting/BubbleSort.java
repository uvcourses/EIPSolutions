package com.algo.backtracking.sorting;

public class BubbleSort {
    public void bubbleSort(int arr[]) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int red = arr.length - 1; red > i; red--) {

                if (arr[red - 1] > arr[red]) {
                    count++;
                    swap(arr, red, red - 1);
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("count "+count);
    }

    private void swap(int[] input, int s, int t) {
        int temp = input[s];
        input[s] = input[t];
        input[t] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(new int[]{10,9,8,7,6,5,4,3,2,1});
    }
}
