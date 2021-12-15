package com.algo.backtracking;

public class InsertIntoBinaryTree {
    public Tree insertTree(Tree head, int data) {
        if (head == null) {
            head = new Tree(data);
            return head;
        }
        if (head.data < data) {
            head.right = insertTree(head.right, data);
        } else {
            head.left = insertTree(head.left, data);
        }
        return head;
    }

    public static void main(String[] args) {
        Tree head = new Tree(10);
        head.left = new Tree(5);
        head.right = new Tree(20);
        head.left.left = new Tree(4);
        head.left.right = new Tree(8);
        head.right.left = new Tree(18);
        head.right.right = new Tree(25);
        InsertIntoBinaryTree insertIntoBinaryTree = new InsertIntoBinaryTree();
        insertIntoBinaryTree.insertTree(head, 16);
    }
}
