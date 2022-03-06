package com.algo.backtracking.sorting;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    private int[] merge(int[] number) {

        helper(number, 0, number.length - 1);
        for (int num : number) {
            System.out.println(num);
        }
        return number;
    }

    public void helper(int input[], int start, int end) {

        if (start == end) {
            return;
        }
        int mid = (start + start) / 2;
        helper(input, start, mid);
        helper(input, mid + 1, end);

        int i = start;
        int j = mid + 1;
        int temp[] = new int[(end - start) + 1];
        int k = 0;
        while (i <= mid && j <= end) {

            if (input[i] <= input[j]) {
                temp[k++] = input[i];
                i++;
            } else {
                temp[k++] = input[j];
                j++;
            }
        }
        while (i <= mid) {
            temp[k++] = input[i++];
        }
        while (j <= end) {
            temp[k++] = input[j++];
        }

        for (int p = start; p <= end; p++) {
            input[p] = temp[p - start];
        }
        return;
    }
}
