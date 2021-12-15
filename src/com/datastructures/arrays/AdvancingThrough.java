package com.datastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class AdvancingThrough {
    private boolean advancingArray(List<Integer> maxAdvanceSteps) {
        int furthestSOFar = 0, lastIndex = maxAdvanceSteps.size() - 1;
        int steps=0;
        int i=0;
        for ( i = 0; i <= furthestSOFar && furthestSOFar < lastIndex; i++) {
            furthestSOFar = Math.max(furthestSOFar, i + maxAdvanceSteps.get(i));
            steps++;
        }
        System.out.println("Minimum Steps required :: "+steps);
        return furthestSOFar >= lastIndex;
    }

    public static void main(String[] args) {
        AdvancingThrough advancingThrough = new AdvancingThrough();
        System.out.println(advancingThrough.advancingArray(Arrays.asList(3, 0, 1, 0, 2, 0, 1)));
        System.out.println(advancingThrough.advancingArray(Arrays.asList(3, 2, 0, 0, 2, 0, 1)));
        System.out.println(advancingThrough.advancingArray(Arrays.asList(2, 4, 1, 1, 0, 2, 3)));
    }
}
