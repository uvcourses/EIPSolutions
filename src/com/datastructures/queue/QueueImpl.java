package com.datastructures.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueImpl {

    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);

       // deque.forEach(s-> System.out.print(s +" "));
        System.out.println("Stack");
        Iterator<Integer> iterator=deque.iterator();
        while(!deque.isEmpty()){
            Integer number=deque.pollFirst();
            System.out.print(number +" ");
        }
        System.out.println("Queue");
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);

        while(!deque.isEmpty()){
            Integer number=deque.pollLast();
            System.out.print(number +" ");
        }


    }

}
