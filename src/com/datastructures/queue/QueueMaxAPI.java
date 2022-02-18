package com.datastructures.queue;

import java.util.*;

public class QueueMaxAPI {
    Queue<Integer> queue = new ArrayDeque<>();
    Deque<Integer> max = new ArrayDeque<>();

    public int getMax() {
        if (!max.isEmpty()) {
            return max.peekFirst();
        }
        return 0;
    }

    public void push(int data) {
        queue.add(data);
        max.addFirst(Math.max(data, !max.isEmpty() ? max.peekFirst() : data));
    }

    public void pop() {
        Integer poll = queue.poll();
        max.remove(poll);
        while(!queue.isEmpty()){
           // max.addFirst(Math.max(max.peekFirst(),));
        }
    }

    public static void main(String[] args) {
        QueueMaxAPI queueMaxAPI = new QueueMaxAPI();
        queueMaxAPI.push(135);
        queueMaxAPI.push(15);
        queueMaxAPI.push(125);
        queueMaxAPI.push(75);
        queueMaxAPI.push(65);
        queueMaxAPI.push(45);

          System.out.println(queueMaxAPI.getMax());

          queueMaxAPI.pop();
         System.out.println(queueMaxAPI.getMax());

    }
}
