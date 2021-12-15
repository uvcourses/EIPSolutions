package com.datastructures.arrays;

public class DucanFlag03 {
    private void rearrange(int data[]) {

        int start = 0, mid1 = 0, mid2 = data.length - 1, end = data.length - 1;

        while (mid1 <= mid2) {
            if (data[mid1] == 0) {
                int temp = data[mid1];
                data[mid1] = data[start];
                data[start] = temp;
                start++;
                mid1++;
            } else if (data[mid1] == 1) {
                mid1++;
            } else if (data[mid1] == 2) {
                int temp = data[mid1];
                data[mid1] = data[mid2];
                data[mid2] = temp;
                mid2--;
            } else {
                int temp = data[mid1];
                data[mid1] = data[end];
                data[end] = temp;
                end--;
            }
        }
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
    }

    public static void main(String[] args) {
        DucanFlag03 ducanFlag03 = new DucanFlag03();
        ducanFlag03.rearrange(new int[] {0,1,2,3,0,1,2,3});
        System.out.println();
        ducanFlag03.rearrange(new int[] {0,0,1,1,2,2,3,3});
    }
}
