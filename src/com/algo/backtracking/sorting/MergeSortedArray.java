package com.algo.backtracking.sorting;

import javafx.scene.media.MediaErrorEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        int i = 0;
        int firstEnd = first.size() - 1;
        int secondIndex = firstEnd;
        int secondEnd = second.size() - 1;
        while (secondEnd >=0) {
            if (second.get(secondIndex) >= first.get(firstEnd)) {
                second.set(secondEnd, second.get(secondIndex));
                secondEnd--;
                secondIndex--;
            } else {
                second.set(secondEnd, first.get(firstEnd));
                firstEnd--;
                secondEnd--;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        merge_one_into_another(new ArrayList<Integer>(Arrays.asList(1, 3, 5)), new ArrayList<Integer>(Arrays.asList(2, 4, 6, 0, 0, 0)));
    }
}
