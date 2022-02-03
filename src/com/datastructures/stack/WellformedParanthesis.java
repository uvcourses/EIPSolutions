package com.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class WellformedParanthesis {
    public boolean wellFormed(String expression) {
        Deque<Character> express = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
                express.addFirst(expression.charAt(i));
            } else {
                if (express.isEmpty()) {
                    return false;
                }
                if ((express.peekFirst() == '{') && !(expression.charAt(i) == '}') &&
                        ((express.peekFirst() == '(') && !(expression.charAt(i) == ')')) &&
                        ((express.peekFirst() == '[') && !(expression.charAt(i) == ']'))) {
                    return false;
                }
                express.removeFirst();
            }
        }
        return express.isEmpty();
    }

    public static void main(String[] args) {
        WellformedParanthesis wellformedParanthesis=new WellformedParanthesis();
        System.out.println(wellformedParanthesis.wellFormed("{}{}()[]"));
        System.out.println(wellformedParanthesis.wellFormed("[{}{}{}{]"));
        System.out.println(wellformedParanthesis.wellFormed("()[]"));
        System.out.println(wellformedParanthesis.wellFormed("{{}(()[]}"));
    }
}
