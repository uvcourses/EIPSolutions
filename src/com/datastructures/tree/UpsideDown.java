package com.datastructures.tree;

import com.algo.backtracking.Tree;

public class UpsideDown {

    public void upsideDown(BinaryTreeNode root){
      BinaryTreeNode newRoot  =helper(root);
        System.out.println(newRoot);
    }

    private BinaryTreeNode helper(BinaryTreeNode node){
        if(node==null){
            return node;
        }
        if(node.left==null && node.right==null){
            return node;
        }
        // recursive case
        BinaryTreeNode newParent=helper(node.left);

        node.left.left=node.right;
        node.left.right=node;
        node.right=null;
        node.left=null;
     return newParent;
    }

    public static void main(String[] args) {
        BinaryTreeNode root=new BinaryTreeNode(1);
        BinaryTreeNode two=new BinaryTreeNode(2);
        BinaryTreeNode three=new BinaryTreeNode(3);
        BinaryTreeNode four=new BinaryTreeNode(4);
        BinaryTreeNode five=new BinaryTreeNode(5);
        BinaryTreeNode six=new BinaryTreeNode(6);
        BinaryTreeNode seven=new BinaryTreeNode(7);
        root.left=two;
        root.right=three;
        two.left=four;
        two.right=five;
        four.left=six;
        four.right=seven;

        UpsideDown upsideDown=new UpsideDown();
        upsideDown.upsideDown(root);


    }
}
