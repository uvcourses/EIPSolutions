package com.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStack {
    Deque<Integer> deque = new ArrayDeque<>();
    Deque<Integer> enqueue = new ArrayDeque<>();

    public void enqueue(int data) {
        enqueue.addFirst(data);
    }

    public int dequeue() {
        while (deque.isEmpty()) {
            while (!enqueue.isEmpty())
                deque.addFirst(enqueue.removeFirst());
        }
        int result = deque.removeFirst();
        return result;
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack=new QueueUsingStack();
        queueUsingStack.enqueue(70);
        queueUsingStack.enqueue(60);
        queueUsingStack.enqueue(50);
        queueUsingStack.enqueue(40);
        queueUsingStack.enqueue(30);
        queueUsingStack.enqueue(20);
        queueUsingStack.enqueue(10);

        System.out.println(queueUsingStack.dequeue());
        queueUsingStack.enqueue(80);
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());

    }
}
