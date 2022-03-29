package com.datastructures.tree;

import java.util.ArrayList;

public class RoottoLeafPrinting {


    static ArrayList<ArrayList<Integer>> all_paths_of_a_binary_tree(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> partialSol=new ArrayList<Integer>();

        helper(root,partialSol,result);
        System.out.printf(""+result);
        return result;
    }


    static void helper(BinaryTreeNode root, ArrayList<Integer> partialSol, ArrayList<ArrayList<Integer>> result) {

        if (root.left == null && root.right==null) {
            if (partialSol.size() > 0) {
                partialSol.add(root.data);
                result.add((ArrayList<Integer>) partialSol.clone());
                partialSol.remove(partialSol.size() - 1);
                return;
            }
        }


        if (root.left != null) {
            partialSol.add(root.data);
            helper(root.left, partialSol, result);
            partialSol.remove(partialSol.size() - 1);
        }

        if (root.right != null) {
            partialSol.add(root.data);
            helper(root.right, partialSol, result);
            partialSol.remove(partialSol.size() - 1);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer>  root=new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> left=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right=new BinaryTreeNode<>(3);
        root.left=left;
        root.right=right;
        BinaryTreeNode<Integer> left1=new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> right1=new BinaryTreeNode<>(5);
        left.left=left1;
        left.right=right1;


        BinaryTreeNode<Integer> left2=new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> right2=new BinaryTreeNode<>(7);
        right.left=left2;
        right.right=right2;

        all_paths_of_a_binary_tree(root);

    }
}
