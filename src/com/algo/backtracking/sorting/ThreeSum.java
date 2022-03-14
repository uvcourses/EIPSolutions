package com.algo.backtracking.sorting;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int target = nums[i] + nums[j] + nums[k];
                if (target == 0) {
                    List<Integer> interMident = new ArrayList<>();
                    interMident.add(nums[i]);
                    interMident.add(nums[j]);
                    interMident.add(nums[k]);
                    result.add(interMident);
                    j++;
                    k--;
                } else if (target > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        System.out.println(result);
        return new ArrayList<>(result);
    }


    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
