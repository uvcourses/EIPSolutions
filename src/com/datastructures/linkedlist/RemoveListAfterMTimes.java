package com.datastructures.linkedlist;

import java.util.Arrays;

public class RemoveListAfterMTimes {
    public Node remove(Node head, int k) {
        Node iter = head;
        Node prev = null;
        while (iter != null) {
            int i = 1;
            Node distrinct = iter.next;
            while (distrinct != null && distrinct.data == iter.data) {
                i++;
                distrinct = distrinct.next;
            }
            /*there is no element within given range */
            if (prev == null && distrinct == null)
                return null;

            if (i >= k) {
                if (prev == null) {
                    head = distrinct;
                } else {
                    prev.next = distrinct;
                }
            } else {
                prev = iter;
            }
            iter = distrinct;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveListAfterMTimes removeListAfterMTimes = new RemoveListAfterMTimes();
        ListOfNode list = new ListOfNode();
        Node input = list.constructNode(Arrays.asList(1, 2, 3, 4, 4, 4, 4));
        Node result = removeListAfterMTimes.remove(input, 2);
        list.printList(result, "After Reordered ");
    }
}
