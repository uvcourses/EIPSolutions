/*
package com.algo.backtracking.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class OnlineMedia {
    static ArrayList<Integer> online_median01(ArrayList<Integer> stream) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < stream.size(); i++) {
            int red=i-1;
            int temp=stream.get(i);
            while(red>=0 && stream.get(red) >temp){
                stream.set(red+1,stream.get(red));
                red--;
            }
            stream.set(red+1,temp);
            int currentsize = i+1;
            if (currentsize % 2 == 0) {
                int size = currentsize / 2;
                result.add((stream.get(size) + stream.get(size - 1)) / 2);
            }else {
                result.add(stream.get(currentsize/2));
            }
        }
        return result;
    }

   */
/* static ArrayList<Integer> online_median(ArrayList<Integer> stream) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
       // minHeap.offer()


    }*//*


    public static void main(String[] args) {
    ArrayList<Integer> stream=new ArrayList<>();
    stream.add(3);stream.add(8);stream.add(5);stream.add(2);
        online_median(stream);
    }
}
*/
