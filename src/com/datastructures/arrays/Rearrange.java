package com.datastructures.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rearrange {

    public void rearrange(List<Integer> data) {
        for (int i = 1; i < data.size() - 1; i++) {
            if ((i % 2) == 0 && data.get(i) > data.get(i - 1) ||
                    ((i % 2) != 0 && data.get(i) < data.get(i - 1))) {
                Collections.swap(data, i, i - 1);
            }
        }

        data.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Rearrange rearrange=new Rearrange();
        rearrange.rearrange(Arrays.asList(12,13,14,15,16,17,18,19));
    }
}
