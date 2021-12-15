package com.datastructures.arrays;

public class DucanFlag02 {
    private void rearrange(int data[]) {
        int start = 0, mid = 0, end = data.length - 1;

        while (mid <=end) {
            if (data[mid] == 0) {
                int temp = data[start];
                data[start++] = data[mid];
                data[mid++]=temp;
            } else if (data[mid] == 1) {
                mid++;
            } else {
                int temp = data[mid];
                data[mid] = data[end];
                data[end--] = temp;
            }
        }
        for (int i=0;i<data.length;i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        DucanFlag02 ducanFlag02 = new DucanFlag02();
        ducanFlag02.rearrange(new int[] {0,1,2,0,1,2,0,1,2});
    }
}
