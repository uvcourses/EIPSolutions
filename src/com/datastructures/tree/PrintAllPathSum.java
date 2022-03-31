package com.datastructures.tree;

import java.util.ArrayList;

public class PrintAllPathSum {

    static ArrayList<ArrayList<Integer>> all_paths_sum_k(BinaryTreeNode root, Integer k) {

        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> partialSol=new ArrayList<Integer>();
        helper(root,k,partialSol,result);

        return result;
    }


    static void helper(BinaryTreeNode root, int k,ArrayList<Integer> partialSol,ArrayList<ArrayList<Integer>> result){
        if(root.left==null && root.right==null){
            if(k==root.data){
                partialSol.add(k);
                result.add( (ArrayList<Integer>)partialSol.clone());
            }
            return;
        }

        if(root.left!=null) {
            partialSol.add(root.data);
            helper(root.left,k-root.data,partialSol,result);
            partialSol.remove(partialSol.size()-1);
        }

        if(root.right!=null) {
            partialSol.add(root.data);
            helper(root.right,k-root.data,partialSol,result);
            partialSol.remove(partialSol.size()-1);
        }



    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> twentyfive=new BinaryTreeNode<>(25);
        BinaryTreeNode<Integer> fourtyfive=new BinaryTreeNode<>(45);
        BinaryTreeNode<Integer> thirty=new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> fourty=new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> fifty=new BinaryTreeNode<>(50);

        root.left=twentyfive;
        twentyfive.left=fourtyfive;

        root.right=thirty;
        thirty.left=fourty;
        thirty.right=fifty;


        BinaryTreeNode<Integer> root1=new BinaryTreeNode<>(100);
        BinaryTreeNode<Integer> twoHundred=new BinaryTreeNode<>(200);
            root1.right=twoHundred;

        all_paths_sum_k(root1,300);

    }
}
