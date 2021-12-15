package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multiplication {
    public List<Integer> multiply(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(list1.size() + list2.size(), 0));

        int sign = list1.get(0) < 0 ^ list2.get(0) < 0 ? -1 : 1;

        list1.set(0, Math.abs(list1.get(0)));
        list2.set(0, Math.abs(list2.get(0)));

        for (int i = list1.size() - 1; i >= 0; i--) {
            for (int j = list2.size() - 1; j >= 0; j--) {
                result.set(i + j + 1, result.get(i + j + 1) + list1.get(i) * list2.get(j));
                result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
                result.set(i + j + 1, result.get(i + j + 1) % 10);
            }
        }
        if (sign == -1)
            result.set(0, result.get(0) * -1);
        return result;
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        List<Integer> result = multiplication.multiply(Arrays.asList(-8, 8), Arrays.asList(8, 8));
        System.out.println(result);

        System.out.println(-1 < 0 ^ 1 < 0);
    }
}
