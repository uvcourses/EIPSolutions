package com.datastructures.tree;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestElelment {
    int smallest=0;
    int count=0;


    PriorityQueue priorityQueue=new PriorityQueue();



    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return smallest;
    }

    public int helper(TreeNode root, int k){
        if(root==null){
          //  priorityQueue.add();
            priorityQueue.poll();
            return 0;
        }

        // recursive case

        if(root.left!=null){
            helper(root.left,k);
        }
        count++;

        if(k==count){
            smallest=root.data;
            return root.data;
        }
        if(root.right!=null){
            helper(root.right,k);
        }

        return smallest;

    }
    public static void main(String[] args) {
      TreeNode treeNode=new TreeNode(3);
      TreeNode one=new TreeNode(1);
      TreeNode four=new TreeNode(4);
      TreeNode two=new TreeNode(2);

      treeNode  .left=one;
      treeNode.right=four;
      one.left=two;
        SmallestElelment smallestElelment=new SmallestElelment();
        smallestElelment.kthSmallest(treeNode,1);
    }
}
