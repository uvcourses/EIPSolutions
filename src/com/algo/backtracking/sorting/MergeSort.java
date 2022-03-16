package com.algo.backtracking.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
   //     mergeSort.merge(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        merge_sort(new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7)));
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
        int mid = (start + end) / 2;
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

    static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {

        // Write your code here.

        helper(arr,0,arr.size()-1);

        System.out.println(arr);
        return arr;
    }
    static void helper(ArrayList<Integer> arr,int start,int end) {

        if(start==end) {
            return;
        }
        int mid= (end+start)/2;

        helper(arr,start,mid);
        helper(arr, mid+1,end);

        int i=start;
        int j=mid+1;
        int k=0;
        ArrayList<Integer> temp=new ArrayList<>((end-start)+1);

        while(i<=mid && j<=end ) {
            if(arr.get(i) <=arr.get(j)){
                temp.add(k++,arr.get(i));
                i++;
            }
            else {
                temp.add(k++,arr.get(j));
                j++;
            }
        }

        while(i<=mid) {
            temp.add(k++,arr.get(i));
            i++;
        }

        while(j<=end) {
            temp.add(k++,arr.get(j));
            j++;
        }

        for(int p=start;p<=end;p++) {
            arr.set(p,temp.get(p-start));
        }

    }
}
