package com.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImpl {

    Deque<MaxValue> stack = new ArrayDeque();
    Deque<Integer> element = new ArrayDeque<>();

    public void push(Integer value) {
        element.addFirst(value);

        if (!stack.isEmpty()) {
            if (Integer.compare(value, stack.peekFirst().max) == 0) {
                stack.peekFirst().count = stack.peekFirst().count + 1;
            } else if (Integer.compare(value, stack.peekFirst().max) > 0) {
                stack.addFirst(new MaxValue(value, 1));
            }
        } else {
            stack.addFirst(new MaxValue(value, 1));
        }

        //  stack.addFirst(new MaxValue(value, Math.max(value, stack.isEmpty() ? value : stack.peek().max)));
    }

    public Integer pop() {
        Integer popelement = element.removeFirst();
        if (popelement.equals(stack.peekFirst().max)) {
            stack.peekFirst().count = stack.peekFirst().count - 1;
            if (stack.peekFirst().count.equals(0)) {
                stack.removeFirst();
            }
        }
        return popelement;
    }

    public Integer max() {
        return stack.peekFirst().max;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(60);
        stack.push(60);
        stack.push(50);

        //  System.out.println(stack.pop());
        System.out.println("Max Value " + stack.max());
        System.out.println("Max Value " + stack.max());
        System.out.println("Max Value " + stack.max());

    }
}
