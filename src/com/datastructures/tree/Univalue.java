package com.datastructures.tree;

public class Univalue {

    static Integer globalCount=0;
    static Integer find_single_data_trees(BinaryTreeNode root) {
        if(root ==null) {
            return 0;
        }

        helper(root);
        System.out.printf(""+globalCount);
        return globalCount;
    }


    static boolean helper(BinaryTreeNode root){

        //Base case 
        if(root.left==null && root.right==null){
            globalCount++;
            return true;
        }

        // Recursive Case 
        boolean amiunival=true;
        if(root.left!=null) {
            boolean left = helper(root.left);
            if (!left || root.data != root.left.data) {
                amiunival = false;
            }
        }
            if(root.right!=null){
                boolean right=helper(root.right);
                if(!right || root.right.data!=root.data){
                    amiunival=false;
                }
            }


        if(amiunival){
            globalCount++;
        }
        return amiunival;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer>  root=new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> left=new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> right=new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> left1=new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> right1=new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> right2=new BinaryTreeNode<>(5);

        root.left=left;
        root.right=right;

        left.left=left1;
        left.right=right1;

        right1.right=right2;


        find_single_data_trees(root);

    }
}
