package com.datastructures.arrays;

public class DucanFlag {

    public void rearrange(int arr[],int ind) {
        int start=0,end=arr.length;
        int pivot=arr[ind];

        while(start<end) {
            if(arr[start] > pivot ) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
            }

            else {
                start++;
            }
        }
        System.out.println(" ");

        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }

    }
    public void rearrange01(int arr[],int ind) {
        int start=0,equal=0,end=arr.length;
        int pivot=arr[ind];
        while(equal<end) {
            if(arr[equal] < pivot){
                int temp=arr[start];
                arr[start]=arr[equal];
                arr[equal]=temp;
                start++;
                equal++;
            }
            else if(arr[start] == pivot) {
                ++equal;
            }else {
                int temp=arr[end];
                arr[end]=arr[equal];
                arr[equal]=temp;
                equal--;
            }
        }
        System.out.println(" ");

        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        DucanFlag d=new DucanFlag();
        d.rearrange(new int[] {0,1,2,0,2,1,1},2);
        d.rearrange01(new int[] {0,1,2,0,2,1,1},2);
    }
}
