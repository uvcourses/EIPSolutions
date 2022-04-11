package com.datastructures.tree;

public class SmallestElementofBST {

    static int smallestElement=0;
    static Integer kth_smallest_element(BinaryTreeNode root, Integer k) {
        // Write your code here.
        return helper(root,k,0);
    }
    static Integer helper(BinaryTreeNode root, Integer k,int count){
        // base case
        if(root==null){
            return 0;
        }
        // Recursive case
        if(root.left!=null)
            smallestElement= helper(root.left,k,count);
        if(count==k) {
            smallestElement=root.data;
            System.out.println("smallestElement "+smallestElement);
            return smallestElement;
        }
        if(root.right!=null){
            smallestElement= helper(root.right,k,count++);
        }
        return smallestElement;
    }
    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode(2);
        BinaryTreeNode left=new BinaryTreeNode(1);
        BinaryTreeNode right=new BinaryTreeNode(3);

        root.left=left;
        root.right=right;
        kth_smallest_element(root,3);

    }
}
