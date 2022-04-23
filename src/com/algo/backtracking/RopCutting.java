package com.algo.backtracking;

public class RopCutting {
    static Long max_product_from_cut_pieces(Integer n) {
        // Write your code here.
        long table[]=new long[n+1];


        for(int k=0;k<=n;k++){
            table[k]=k;
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                table[i]=Math.max(table[i],j*table[i-j]);
            }
        }
        return table[n];
    }
    public static void main(String[] args) {
        System.out.println(max_product_from_cut_pieces(4));
    }
}
