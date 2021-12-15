package com.algo.backtracking;

public class MergeSort {

    public void mergeSort(int data[],int start,int end){

        if(start < end) {
            int mid=(end+start)/2;
            mergeSort(data,start,mid);
            mergeSort(data,mid+1,end);
            merge(data,start,mid,end);
        }
    }

    private void merge(int[] data, int start, int mid, int end) {

        int i=start,j=mid+1,k=0;
        int temp[]=new int[(end-start)+1];
        while(i<=mid && j<=end) {
            if(data[i] <=data[j]){
                temp[k++]=data[i++];
            }else {
                temp[k++]=data[j++];
            }
        }

        while(i<=mid) {
            temp[k++]=data[i++];
        }

        while(j<=end) {
            temp[k++]=data[j++];
        }

        for(i=start;i<=end;i++){
            data[i]=temp[i-start];
        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        int data[]=new int[] {3,4,5,10,-5,0,2};
        mergeSort.mergeSort(data,0,data.length-1);
        System.out.println("closed");

        for(int a:data) {
            System.out.println(a);
        }

    }
}
