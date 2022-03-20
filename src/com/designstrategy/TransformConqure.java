package com.designstrategy;

import java.util.*;

public class TransformConqure {

    private int kthLargestElement(ArrayList<Integer> numbers, int k) {
        int result = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < numbers.size(); i++) {
            priorityQueue.add(numbers.get(i));
        }
        int j = 1;
        while (!priorityQueue.isEmpty() && j <= k) {
            int result1 = priorityQueue.poll();
            if (j == k) {
                return result1;
            }
            j++;
        }
        return result;
    }

    private List<Integer> kthLargestElement(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= initial_stream.size(); i++) {
            priorityQueue.add(initial_stream.get(i));
        }
        int j = 0, L = 0;
        while (j < append_stream.size()) {
            priorityQueue.add(append_stream.get(j));
            int M = 1;
            while (M <= k) {
                int poll = priorityQueue.poll();
                if (M == k) {
                    result.add(poll);
                }
                priorityQueue.add(poll);
                M++;
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        TransformConqure transformConqure = new TransformConqure();
        List<Integer> arrayList = Arrays.asList(-7, -6, 0, 0, 8, 9, 10);
        List<Integer> initial_stream = Arrays.asList(4, 6);
        List<Integer> append_stream = Arrays.asList(5, 2, 20);
        transformConqure.kthLargestElement(2, new ArrayList<>(initial_stream), new ArrayList<>(append_stream));
    }
}
