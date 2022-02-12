package com.datastructures.linkedlist;

import java.util.Arrays;

public class Palindrome {
    public boolean isPalindrome(Node L) {
        Node dummy = new Node(0);

        dummy.next = L;
        Node slow = L;
        Node fast = L;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfIter = reverseList(slow);
        Node firstHalf = L;

        while (secondHalfIter != null && firstHalf != null) {
            if (secondHalfIter.data != firstHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalfIter = secondHalfIter.next;
        }
        return true;
    }

    public Node reverseList(Node slow) {
        Node current = slow;
        Node prev = null;

        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current=temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListOfNode listOfNode = new ListOfNode();
        Node input = listOfNode.constructNode(Arrays.asList(1, 2, 3, 1, 2, 1));
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(input));
    }
}
