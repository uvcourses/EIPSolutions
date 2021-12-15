package com.datastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    private void removeDuplciate(List<Integer> input) {
        int start = 0, current = 0, end = input.size() - 1;
        while (start <= current && current <= end) {
            if (input.get(start) == input.get(current)) {
                current++;
            } else {
                if ((current - start) > 1) {
                    input.set(start + 1, input.get(current));
                }
                start++;
                current++;
            }
        }
        for (int i = start + 1; i <= end; i++) {
            input.set(i, 0);
        }
        input.stream().forEach(System.out::print);
    }
    private int removeDuplicates2(int []arr, int m) {
  int min = Math.min(2, m);

        int vacancy = 0;
        int lastUniqueNum = 0;
        int dupes = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != lastUniqueNum) {
                if(dupes == m) {
                    vacancy -= dupes - min;
                }
                lastUniqueNum = arr[i];
                dupes = 0;
            }

            dupes++;
            arr[vacancy++] = arr[i];
        }

        return vacancy;
    }
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        removeDuplicate.removeDuplciate(Arrays.asList(2, 3, 5, 5, 7, 11, 11, 11, 13));
        System.out.println("");
        removeDuplicate.removeDuplciate(Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3));
        System.out.println("");
        removeDuplicate.removeDuplciate(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));

        removeDuplicate.removeDuplicates2(new int [] {2, 3, 5, 5, 7, 11, 11, 11, 13},1);
        System.out.println("");

    }
}
