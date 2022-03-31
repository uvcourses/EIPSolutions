package com.datastructures.tree;

import com.datastructures.linkedlist.LinkedListNode;

public class ConvertListtoBST {
    static BinaryTreeNode sorted_list_to_bst(LinkedListNode head) {
        // Write your code here.

        return helper(head);
    }
    private static BinaryTreeNode helper(LinkedListNode head) {
        // base case
        if (head == null) {
            return null;
        }
        if(head.next.next==null){
            BinaryTreeNode root=new BinaryTreeNode(head.value);
            root.right=new BinaryTreeNode(head.next.value);
            return root;
        }
        if (head.next == null) {
            return new BinaryTreeNode(head.value);
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        LinkedListNode prev = null;
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null;
        }
        BinaryTreeNode root = new BinaryTreeNode(slow.value);
        // recursive
        root.left = helper(head);
        root.right = helper(slow.next);
        return root;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(-1);

        LinkedListNode two = new LinkedListNode(2);
        head.next = two;
       /* LinkedListNode three = new LinkedListNode(3);
        two.next = three;
        LinkedListNode four = new LinkedListNode(4);
        three.next = four;
        LinkedListNode five = new LinkedListNode(5);
        four.next = five;
        LinkedListNode six = new LinkedListNode(6);
        five.next = six;
        LinkedListNode seven = new LinkedListNode(10);
        six.next = seven;*/
        helper(head);
    }
}
