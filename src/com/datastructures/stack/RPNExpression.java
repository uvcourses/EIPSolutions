package com.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RPNExpression {
    public int eval(String Expression) {
        Deque<Integer> intermediateResult = new ArrayDeque();

        String tokens[] = Expression.split(",");

        for (String token : tokens) {
            if (token.length() == 1 && "+-*/".contains(token)) {
                int x = intermediateResult.removeFirst();
                int y = intermediateResult.removeFirst();
                switch (token.charAt(0)) {
                    case '+':
                        intermediateResult.addFirst(x + y);
                        break;
                    case '-':
                        intermediateResult.addFirst(x - y);
                        break;
                    case '*':
                        intermediateResult.addFirst(x * y);
                        break;
                    case '/':
                        intermediateResult.addFirst(x / y);
                        break;
                    default:

                }
            } else {
                intermediateResult.addFirst(Integer.parseInt(token));
            }
        }
        return intermediateResult.removeFirst();
    }

    public static void main(String[] args) {
        RPNExpression rpnExpression=new RPNExpression();
        int result=rpnExpression.eval("3,4,+,2,*,1,+");
        System.out.println(result);
    }
}
