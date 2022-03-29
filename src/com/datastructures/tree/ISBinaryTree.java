package com.datastructures.tree;

public class ISBinaryTree {
    static Boolean helper(BinaryTreeNode root,Integer low, Integer high){
        if(root==null){
            return true;
        }
        if((low!=null && low>root.data) || (high!=null && high<root.data)){
            return false;
        }

        //boolean left = helper(root.left,low,root.value);
        //boolean right = helper(root.right,root.value,high);
        return helper(root.right,root.data,high) && helper(root.left,low,root.data);
    }
    static Boolean is_bst(BinaryTreeNode root) {
        return helper(root,null,null);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer>  root=new BinaryTreeNode<>(400);
        BinaryTreeNode<Integer> left=new BinaryTreeNode<>(200);
        BinaryTreeNode<Integer> right=new BinaryTreeNode<>(300);

        BinaryTreeNode<Integer> left1=new BinaryTreeNode<>(100);
        BinaryTreeNode<Integer> right1=new BinaryTreeNode<>(400);



        root.left=left;
        root.right=right;

        left.left=left1;
        right.right=right1;

        is_bst(root);

        System.out.print(is_bst(root).booleanValue());
    }
}
