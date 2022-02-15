package com.datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueMaxAPI {
    Deque<QueueMax> queue=new ArrayDeque<>();
    public int getMax(){
        if(!queue.isEmpty()){
            return queue.peekLast().max;
        }
        return 0;
    }
    public void push(int data){
        queue.add(new QueueMax(data,Math.max(data,!queue.isEmpty() ? queue.getLast().max:data)));
    }
    public void pop(){
        System.out.println(queue.removeFirst().element);
    }
    public static void main(String[] args) {
        QueueMaxAPI queueMaxAPI=new QueueMaxAPI();
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
