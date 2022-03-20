package com;

import java.math.BigDecimal;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Comparator.reverseOrder());
        int a[] = new int[]{5, 1, 10, 3, 2};
        for (int i = 0; i < 5; i++) {
            priorityQueue.add(a[i]);
        }
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());
    }
}
