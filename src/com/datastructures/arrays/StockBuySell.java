package com.datastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class StockBuySell {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> day = Arrays.asList(310, 315, 275, 295, 220, 270, 290, 230, 255, 250);
        for (int data : day) {
            min = Math.min(min, data);
            max = Math.max(max, data - min);
        }
        System.out.println(max);
    }
}
