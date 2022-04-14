package com.dp;

public class MinCoinChange {
    public int coinChange(int[] coins, int amount) {
        int table[]=new int[amount+1];
        table[0]=0;
        for(int j=1;j<table.length;j++){
            table[j]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if((i-c)>=0) {
                    table[i]=Math.min(table[i],table[i-c]);
                }
            }
            table[i]++;
        }
        return table[amount];
    }
    public static void main(String[] args) {
        MinCoinChange minCoinChange=new MinCoinChange();
        minCoinChange.coinChange(new int[]{1,5,7},10);
    }
}
