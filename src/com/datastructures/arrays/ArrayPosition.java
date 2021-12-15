package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPosition {
    public static void main(String[] arg) {
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayPosition obj = new ArrayPosition();
        System.out.println("Before ");
        Arrays.stream(input).forEach((s) -> System.out.print(s));
        obj.rearrange(input);
        System.out.println("\n After ");
        Arrays.stream(input).forEach((s) -> System.out.print(s));

    }

    private void rearrange(int[] input) {
        int even = 0, odd = input.length - 1;

        while (even < odd) {
            if (input[even] % 2 == 0) {
                even++;
            } else {
                int temp = input[even];
                input[even] = input[odd];
                input[odd--] = temp;
            }
        }
    }

    public static class AddingOneAtEnd {

        private void addReArrange(List<Integer> data) {
            int i = data.size() - 1;
            data.set(i, data.get(i) + 1);
            while (i > 0) {
                if (data.get(i) == 10) {
                    data.set(i, 0);
                    data.set(i - 1, data.get(i - 1) + 1);
                }
                i--;
            }
            if (data.get(0) == 10) {
                data.set(0, 1);
                data.add(0);
            }
            System.out.println(data);
        }

        public static void main(String[] args) {
            AddingOneAtEnd addingOneAtEnd = new AddingOneAtEnd();
            List<Integer> list = new ArrayList<>();
            list.add(9);
            list.add(9);
            list.add(7);
            addingOneAtEnd.addReArrange(list);
        }
    }
}
