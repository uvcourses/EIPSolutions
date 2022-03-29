/*
package com.datastructures.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedHeightTree {
    int leftHeight = -1, rightHeight = -1;

    public boolean balancedTree(BinaryTreeNode rootNode) {
        return isHeightBalanced(rootNode,-1);
    }

    public boolean isHeightBalanced(BinaryTreeNode currentNode,int height) {
        if (currentNode == null) {
            return true;
        }

       boolean leftTree= isHeightBalanced(currentNode.left,leftHeight);
        if(!leftTree)
            return false;
       boolean rightTree=isHeightBalanced(currentNode.right,rightHeight);

       if(rightTree)
            return false;


        Math.max(leftHeight,rightHeight);
        return Math.abs(leftHeight - rightHeight)<=1;
    }

    public int heightOfTree(BinaryTreeNode height) {
        Deque<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(height);
        int treeHeight = -1;
        while (!queue.isEmpty()) {
            Deque<BinaryTreeNode> nextLevel = new ArrayDeque<>();
            while (!queue.isEmpty()) {
                BinaryTreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
            }
            treeHeight++;
            queue = nextLevel;
        }
        System.out.println("Tree Height " + (treeHeight));
        return treeHeight ;
    }

    public static void main(String[] args) {
        BinaryTreeNode<String> nodeA = new BinaryTreeNode<>("A");

        BinaryTreeNode<String> nodeB = new BinaryTreeNode<>("B");
        BinaryTreeNode<String> nodeC = new BinaryTreeNode<>("C");

        nodeA.left = nodeB;
        //  nodeA.right = nodeC;

        BinaryTreeNode<Integer> nodeD = new BinaryTreeNode<Integer>();
        BinaryTreeNode<Integer> nodeE = new BinaryTreeNode<Integer>();

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        BinaryTreeNode<Integer> nodeF = new BinaryTreeNode<>("F");
        BinaryTreeNode<Integer> nodeG = new BinaryTreeNode<>("G");

        nodeC.left = nodeF;
        nodeC.right = nodeG;


        BalancedHeightTree balancedHeightTree = new BalancedHeightTree();
        balancedHeightTree.heightOfTree(nodeA);
        boolean result = balancedHeightTree.balancedTree(nodeA);
        System.out.println(result);
    }
}
*/
