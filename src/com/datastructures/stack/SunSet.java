package com.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class SunSet {
    public Deque<BuildingWithHeight> examineBuildingWithSunSet(Iterator<Integer> sequence) {
        Deque<BuildingWithHeight> result = new ArrayDeque<>();
        int buildingId = 0;
        while (sequence.hasNext()) {
            Integer newBuildingHeight = sequence.next();
            while (!result.isEmpty() && Integer.compare(newBuildingHeight, result.getLast().height) >= 0) {
                result.removeLast();
            }
            result.addLast(new BuildingWithHeight(buildingId++, newBuildingHeight));
        }
        return result;
    }

    public static void main(String[] args) {
        SunSet sunSet = new SunSet();
        Iterator<Integer> sequence = Arrays.asList(5, 10, 4, 8, 2, 6).iterator();
        Deque<BuildingWithHeight> buildingWithSunSet = sunSet.examineBuildingWithSunSet(sequence);
        while (!buildingWithSunSet.isEmpty()) {
            System.out.println(buildingWithSunSet.pop().height);
        }
    }
}
