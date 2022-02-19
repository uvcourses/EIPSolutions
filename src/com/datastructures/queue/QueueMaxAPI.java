package com.datastructures.queue;

import java.util.*;

public class QueueMaxAPI<T extends Comparable<T>> {
    Queue<T> queue = new ArrayDeque<>();
    Deque<T> max = new ArrayDeque<>();

    public T getMax() {
        if (!max.isEmpty()) {
            return max.peekFirst();
        }
        throw new NoSuchElementException();
    }

    public void enqueue(T data) {
        queue.add(data);
        while (!max.isEmpty() && max.peekLast().compareTo(data) < 0) {
            max.removeLast();
        }
        max.addLast(data);
    }

    public void dequeue() {
        T remove = queue.poll();
        if (remove.equals(max.peekFirst())) {
            max.removeFirst();
        }
    }

    public static void main(String[] args) {
        QueueMaxAPI queueMaxAPI = new QueueMaxAPI();

        queueMaxAPI.enqueue(70);
        queueMaxAPI.enqueue(20);
        queueMaxAPI.enqueue(30);
        queueMaxAPI.enqueue(40);
        queueMaxAPI.enqueue(50);
        queueMaxAPI.enqueue(60);

        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());
        queueMaxAPI.dequeue();
        System.out.println(queueMaxAPI.getMax());


    }
}
