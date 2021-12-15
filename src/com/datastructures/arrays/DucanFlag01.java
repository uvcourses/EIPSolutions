package com.datastructures.arrays;

public class DucanFlag01 {
    private void rearrange(boolean [] data){
        int start =0,end=data.length-1;
        while(start < end){
            if(data[start]==false){
                start++;
            }else{
                boolean temp=data[start];
                data[start]=data[end];
                data[end--]=temp;
            }
        }
        for(int j=0;j<data.length;j++){
            System.out.print(data[j]+" ");
        }
    }
    public static void main(String[] args) {
        DucanFlag01 ducanFlag01=new DucanFlag01();
        ducanFlag01.rearrange(new boolean[] {true,false,true,false,true,false});
    }
}
