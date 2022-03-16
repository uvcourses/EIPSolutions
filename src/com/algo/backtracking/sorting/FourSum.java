package com.algo.backtracking.sorting;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSumTarget(int nums[], int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        int L = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int K = j + 1;
                while (K < L) {
                    int sum = nums[i] + nums[j] + nums[K] + nums[L];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[K], nums[L]));
                        K++;
                        L--;
                    } else if (sum > target) {
                        L--;
                    } else if (sum < target) {
                        K++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        fourSum.fourSumTarget(new int[]{1, 0, -1, 0, -2, 2}, 0);
        ArrayList<Integer> list=new ArrayList<>(1);
        list.add(0,1);
        System.out.println(list);
    }
}
