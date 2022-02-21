package com.datastructures.tree;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(T data) {
        this.left = null;
        this.right = null;
        this.data = data;

    }
}
