package com.datastructures.linkedlist;

import com.sun.org.apache.bcel.internal.generic.L2D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListOfNode {
    public Node constructNode(List<Integer> list) {
        Node result = new Node(0);
        Node head = result;

        for (Integer a : list) {
            Node temp = new Node(a);
            result.next = temp;
            result = temp;
        }

        return head.next;
    }

    public Node constructCycle(List<Integer> list, int cycleNode) {

        Node result = new Node(0);
        Node head = result;
        Node cycle = null;
        for (int i = 0; i < list.size(); i++) {

            if (cycleNode == list.get(i)) {
                cycle = new Node(list.get(i));
                result.next = cycle;
                result = cycle;
            } else {
                Node temp = new Node(list.get(i));
                result.next = temp;
                result = temp;
            }
        }
        result.next = cycle;
        return head.next;

    }

    public void printList(Node print, String message) {
        Node current = print;
        System.out.println(message);
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
    }

    public int lengthOfList(Node node) {
        Node current = node;
        int i = 0;

        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    public Node hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int cycleLen = 0;
                do {
                    ++cycleLen;
                    fast = fast.next;

                } while (slow != fast);
                Node cycleLenAdvancedIter = head;

                while (cycleLen-- > 0) {
                    cycleLenAdvancedIter = cycleLenAdvancedIter.next;
                }

                Node iter = head;
                while (iter != cycleLenAdvancedIter) {
                    iter = iter.next;
                    cycleLenAdvancedIter = cycleLenAdvancedIter.next;
                }
                return iter;
            }
        }
        return null;
    }

    public Node overlapping(Node L1, Node L2) {

        int L1Length = lengthOfList(L1);
        int L2Length = lengthOfList(L2);

        if (L1Length > L2Length) {
            L1 = advanceListByK(L1Length - L2Length,L1);
        }else {
            L2=advanceListByK(L2Length-L1Length,L2);
        }
        while( L1!=null && L2 !=null && L1!=L2){
            L1=L1.next;
            L2=L2.next;
        }
        return L1;
    }

    public static Node advanceListByK(int k, Node L) {
        while (k-- > 0) {
            L = L.next;
        }
        return L;
    }

    public static void main(String[] args) {
        ListOfNode listNode = new ListOfNode();
        Node list = listNode.constructNode(Arrays.asList(1, 2, 3, 4, 5));
        listNode.printList(list, "Constructed List");

        Node cycle = listNode.constructCycle(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 4);
        System.out.println();
    }
}
