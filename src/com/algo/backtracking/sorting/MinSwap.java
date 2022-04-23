package com.algo.backtracking.sorting;

public class MinSwap {
    public static int minSwap(int arr[]){
        int minIndex=0;
        int maxIndex=arr.length-1;
        int minStep=0;

        for(int i=maxIndex;i>0;i--){
            if(arr[i]<arr[i-1] && arr[i]<arr[minIndex]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                minStep++;
            }
        }

        for(int j=0;j<maxIndex;j++){
            if(arr[j]>arr[j+1] && arr[j]> arr[maxIndex]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                minStep++;
            }
        }
        System.out.println(minStep);
        return minStep;
    }
    public static void main(String[] args) {
       minSwap(new int[] {4,11,9,10,12});
        minSwap(new int[] {3,2,1});
        minSwap(new int[] {2,4,3,1,6});
    }
}
