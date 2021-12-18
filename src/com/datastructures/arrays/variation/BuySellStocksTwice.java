package com.datastructures.arrays.variation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Runtime Complexity is O(n)
 * Space Complexity is O(n)
 */
public class BuySellStocksTwice {
    public double buySellStocksTwice(List<Integer> data) {
        double maxTotalProfit=0.0;
        double minPriceSoFar=Double.MAX_VALUE;

        int end = data.size();
        List<Double> firstBuySellProfit = new ArrayList<>();
        for (int i = 0; i < data.size(); ++i) {
            minPriceSoFar = Math.min(minPriceSoFar, data.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, data.get(i) - minPriceSoFar);
            firstBuySellProfit.add(maxTotalProfit);
        }
        double maxPriceSoFar = Integer.MIN_VALUE;

        for (int i = data.size()-1; i > 0; --i) {
            maxPriceSoFar = Math.max(maxPriceSoFar, data.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - data.get(i) + firstBuySellProfit.get(i - 1));
        }
        System.out.println(maxTotalProfit);
        return maxTotalProfit;
    }
    /**
     * Runtime Complexity is O(n)
     * Space Complexity is O(1)
     */
    public int maxProfit(int[] prices) {

        int t1Cost = Integer.MAX_VALUE,
                t2Cost = Integer.MAX_VALUE;
        int t1Profit = 0,
                t2Profit = 0;

        for (int price : prices) {
            // the maximum profit if only one transaction is allowed
            t1Cost = Math.min(t1Cost, price);
            t1Profit = Math.max(t1Profit, price - t1Cost);
            // reinvest the gained profit in the second transaction
            t2Cost = Math.min(t2Cost, price - t1Profit);
            t2Profit = Math.max(t2Profit, price - t2Cost);
        }
        System.out.println(t2Profit);
        return t2Profit;
    }

    public static void main(String[] args) {
        BuySellStocksTwice buySellStocksTwice = new BuySellStocksTwice();
        //    buySellStocksTwice.buySellStocksTwice(Arrays.asList(12, 11, 13, 9, 12, 8, 14, 13, 15));
        buySellStocksTwice.maxProfit(new int[]{1,2});
        buySellStocksTwice.buySellStocksTwice(Arrays.asList(1, 2));
    }
}
