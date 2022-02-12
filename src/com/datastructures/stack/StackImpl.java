package com.datastructures.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

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

    public static class ShortestPathValidation {
        public String shortestPath(String path) {
            if (path.isEmpty()) {
                throw new IllegalArgumentException("invalid value");
            }
            Deque<String> pathNames = new ArrayDeque<>();
            if (path.startsWith("/")) {
                pathNames.addFirst("/");
            }
            for (String token : path.split("/")) {
                if (token.equals("..")) {
                    if (pathNames.isEmpty() || pathNames.peekFirst().equals("..")) {
                        pathNames.addFirst(token);
                    } else {
                        if (pathNames.peekFirst().equals("/")) {
                            // /a/../../b/../c//.//
                        }
                        pathNames.removeFirst();
                    }
                }else if (!token.equals(".") && !token.isEmpty()) {
                    pathNames.addFirst(token);
                }
            }
            StringBuilder result = new StringBuilder();

            if (!pathNames.isEmpty()) {
                Iterator<String> iterator = pathNames.descendingIterator();
                String prev = iterator.next();
                result.append(prev);

                while (iterator.hasNext()) {
                    if (!prev.equals("/")) {
                        result.append("/");
                    }
                    prev = iterator.next();
                    result.append(prev);
                }
            }
            return result.toString();
        }

        public String simplifyPath(String path) {

            // Initialize a stack
            Stack<String> stack = new Stack<String>();
            String[] components = path.split("/");

            // Split the input string on "/" as the delimiter
            // and process each portion one by one
            for (String directory : components) {

                // A no-op for a "." or an empty string
                if (directory.equals(".") || directory.isEmpty()) {
                    continue;
                } else if (directory.equals("..")) {

                    // If the current component is a "..", then
                    // we pop an entry from the stack if it's non-empty
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {

                    // Finally, a legitimate directory name, so we add it
                    // to our stack
                    stack.add(directory);
                }
            }

            // Stich together all the directory names together
            StringBuilder result = new StringBuilder();
            for (String dir : stack) {
                result.append("/");
                result.append(dir);
            }

            return result.length() > 0 ? result.toString() : "/" ;
        }

        public static void main(String[] args) {
            ShortestPathValidation shortestPathValidation = new ShortestPathValidation();
            String output1 = shortestPathValidation.simplifyPath("/a/../../b/../c//.//");
            System.out.println(output1);


      /*      Path path
                    = Paths.get("/a/../../b/../c//.//");

            // print actual path
            System.out.println("Actual Path : "
                    + path);

            // normalize the path
            Path normalizedPath = path.normalize();

            // print normalized path
            System.out.println("\nNormalized Path : "
                    + normalizedPath);*/
        }
    }
}
