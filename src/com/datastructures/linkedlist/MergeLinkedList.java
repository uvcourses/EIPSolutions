package com.datastructures.linkedlist;

import java.util.Arrays;

public class MergeLinkedList {

    public Node mergeList(Node l1, Node l2) {

        Node dummyHead = new Node(0);
        Node head = dummyHead;
        Node p1 = l1;
        Node p2 = l2;

        while (p1 != null && p2 != null) {

            if (p1.data <= p2.data) {
                dummyHead.next = p1;
                dummyHead = p1;
                p1 = p1.next;

            } else {
                dummyHead.next = p2;
                dummyHead = p2;
                p2 = p2.next;
            }

        }
        dummyHead.next = p1 != null ? p1 : p2;
        return head.next;
    }

    public static void main(String[] args) {
        MergeLinkedList linkedList = new MergeLinkedList();
        ListOfNode listOfNode = new ListOfNode();
        Node l1 = listOfNode.constructNode(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Node l2 = listOfNode.constructNode(Arrays.asList(8, 9, 10, 11));
        Node result = linkedList.mergeList(l1, l2);
        listOfNode.printList(result, "Merged List");

    }
}
