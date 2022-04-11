package com.datastructures.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindDifference {

    public int diff(ArrayList<Integer> current, int k) {

        // PriorityQueue<Integer> min=new PriorityQueue<>();
        Collections.sort(current);
        //current.toArray();
        for (int i = 0; i < current.size(); i++) {
            int max = current.get(current.size() - 1);
            int i1 = current.get(current.size() - 1) - current.get(i);

        }

        return 0;

    }

    public static void main(String[] args) {

    }
}
