package com.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuePractice {

    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();

        deque.add(70);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);

        while(!deque.isEmpty()){
            System.out.println(deque.pollLast());
        }
    }
}
