package com.datastructures.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedHeightTree {
    public boolean balancedTree(BinaryTreeNode rootNode) {
        int result = 0;
        result = isHeightBalanced(rootNode);
        if (result <= 1) {
            return true;
        }
        return false;
    }

    public int isHeightBalanced(BinaryTreeNode currentNode) {
        int leftHeight = 0, rightHeight = 0;
        if (currentNode == null) {
            return 1;
        }

        leftHeight += isHeightBalanced(currentNode.left);

        rightHeight += isHeightBalanced(currentNode.right);
        System.out.print(currentNode.data);
        return Math.abs(leftHeight - rightHeight);
    }

    public int heightOfTree(BinaryTreeNode height) {
        Deque<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(height);
        int treeHeight = 0;
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
        System.out.println("Tree Height " + (treeHeight - 1));
        return treeHeight - 1;
    }

    public static void main(String[] args) {
        BinaryTreeNode<String> nodeA = new BinaryTreeNode<>("A");

        BinaryTreeNode<String> nodeB = new BinaryTreeNode<>("B");
        BinaryTreeNode<String> nodeC = new BinaryTreeNode<>("C");

        nodeA.left = nodeB;
        nodeA.right = nodeC;

        BinaryTreeNode<String> nodeD = new BinaryTreeNode<>("D");
        BinaryTreeNode<String> nodeE = new BinaryTreeNode<>("E");

        nodeB.left = nodeD;
        nodeB.right = nodeE;

        BinaryTreeNode<String> nodeF = new BinaryTreeNode<>("F");
        BinaryTreeNode<String> nodeG = new BinaryTreeNode<>("G");

        nodeC.left = nodeF;
        nodeC.right = nodeG;


        BalancedHeightTree balancedHeightTree = new BalancedHeightTree();
        balancedHeightTree.heightOfTree(nodeA);
        boolean result = balancedHeightTree.balancedTree(nodeA);
        System.out.println(result);
    }
}
