package com.dp;

public class MinCostofStair {
    public int minCostClimbingStairs(int[] cost) {
        int table[] = new int[cost.length + 2];
        table[0] = 0;
        table[1] = cost[0];
        for (int i = 2; i < table.length ; i++) {
            if(cost.length>=i)
            table[i] = Math.min(table[i - 1], table[i - 2]) + cost[i - 1];
            else{
                table[i] = Math.min(table[i - 1], table[i - 2]);
            }
        }
        System.out.println(table[cost.length + 1]);
        return table[cost.length+1];
    }

    public static void main(String[] args) {
        MinCostofStair minCostofStair = new MinCostofStair();
        minCostofStair.minCostClimbingStairs(new int[]{10, 15, 20});
    }
}
