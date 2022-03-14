package com.algo.backtracking.sorting;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> aux = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (aux.containsKey(secondNumber)) {
                result[0] = i;
                result[1] = aux.get(secondNumber);
            } else {
                aux.put(nums[i], i);
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);

        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(new int[]{7,6,15},13));
    }
}
