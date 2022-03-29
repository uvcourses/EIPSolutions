package com.datastructures.tree;

public class BinaryTreeNode<T> {
    Integer data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(Integer data) {
        this.left = null;
        this.right = null;
        this.data = data;

    }
}
