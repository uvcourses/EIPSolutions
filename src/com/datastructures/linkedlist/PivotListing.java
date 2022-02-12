package com.datastructures.linkedlist;

import java.util.Arrays;

public class PivotListing {
    public Node pivotList(Node node, int k) {
        Node lessThan = new Node(0);
        Node equal = new Node(0);
        Node greater = new Node(0);

        Node lessIter = lessThan;
        Node equalIter = equal;
        Node greaterIter = greater;

        Node Iter = node;

        while (Iter != null) {
            if (Iter.data < k) {
                lessIter.next = Iter;
                lessIter = lessIter.next;
            } else if (Iter.data == k) {
                equalIter.next = Iter;
                equalIter = equalIter.next;
            } else {
                greaterIter.next = Iter;
                greaterIter = greaterIter.next;
            }
            Iter = Iter.next;
        }
        greaterIter.next = null;
        equalIter.next = greater.next;
        lessIter.next = equal.next;
        return lessThan.next;
    }

    public static void main(String[] args) {
        PivotListing pivotListing = new PivotListing();
        ListOfNode listOfNode = new ListOfNode();
        Node input = listOfNode.constructNode(Arrays.asList(9, 8, 5, 6, 4, 3, 7, 2, 1));
        Node output = pivotListing.pivotList(input, 5);
        listOfNode.printList(output, "After Reordered");
    }
}
