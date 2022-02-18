package com.datastructures.queue;

import java.util.Arrays;
import java.util.Collections;

public class CircularQueue {
    private int head = 0, tail = 0, noOfElements = 0;
    private Integer[] queue;
    private int FACTOR = 2;

    public CircularQueue(int capacity) {
        queue = new Integer[capacity];
    }

    public void enqueue(int data) {
        if (noOfElements == queue.length) {
            Collections.rotate(Arrays.asList(queue), -head);
            queue = Arrays.copyOf(queue, noOfElements * FACTOR);
        }
        queue[tail] = data;
        tail = tail + 1 % queue.length;
        ++noOfElements;
    }

    public int dequeue() {
        int result = 0;
        if (noOfElements != 0) {
            result = queue[head];
            head = head + 1 % queue.length;
            print(queue);
            --noOfElements;
        }
        return result;
    }

    public int size(){
        return noOfElements;
    }

    public void print(Integer[] data) {
        for (int i = head; i < noOfElements; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.enqueue(60);
        System.out.println("Circular Queue ::: "+circularQueue.size());
        circularQueue.dequeue();
        System.out.println("Circular Queue ::: "+circularQueue.size());
    }
}
