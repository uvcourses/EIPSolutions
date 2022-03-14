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
                    List<Integer> result1 = new ArrayList<>();
                    result1.add(nums[i]);
                    result1.add(nums[j]);
                    result1.add(nums[k]);
                    result.add(result1);
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
