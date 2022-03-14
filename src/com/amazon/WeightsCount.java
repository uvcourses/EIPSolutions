package com.amazon;

import java.util.Arrays;
import java.util.List;

public class WeightsCount {
    public int countSegment(List<Integer> weights, int k) {
        int result = 0;
        for (int i = 0; i < weights.size(); i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int j = i;
            while (j < weights.size()) {
                min = Math.min(weights.get(j), min);
                max = Math.max(max, weights.get(j));
                System.out.println(i + "," + j);
                j++;
                if (max - min <= k) {
                    result++;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        WeightsCount weightsCount = new WeightsCount();
        int output = weightsCount.countSegment(Arrays.asList(1, 3, 6), 3);
        System.out.println(output);
    }
}
