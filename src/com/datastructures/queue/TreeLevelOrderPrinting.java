package com.datastructures.queue;

import com.datastructures.linkedlist.Node;
import com.datastructures.tree.TreeNode;
import com.datastructures.tree.TreeWork;

import java.util.*;

public class TreeLevelOrderPrinting {
    public List<List<Integer>> levelOrder(TreeNode input) {
        Deque<TreeNode> currentDepthNode = new LinkedList<>();
        currentDepthNode.add(input);
        List<List<Integer>> result = new LinkedList<>();
        while (!currentDepthNode.isEmpty()) {
            Deque<TreeNode> nextNode = new LinkedList<>();
            List<Integer> levelNode = new ArrayList<>();

            while (!currentDepthNode.isEmpty()) {
                TreeNode currentNode = currentDepthNode.pop();
                if (currentNode != null) {
                    levelNode.add(currentNode.data);
                }
                if(currentNode.left!=null)
                    nextNode.add(currentNode.left);
                if(currentNode.right!=null)
                nextNode.add(currentNode.right);

            }
            result.add(levelNode);
            currentDepthNode = nextNode;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeLevelOrderPrinting treeLevelOrderPrinting = new TreeLevelOrderPrinting();
        TreeWork treeWork = new TreeWork();
        //TreeNode root = treeWork.treeFromString(str, 0, str.length() - 1);
        TreeNode root = treeWork.constructTree();
        treeLevelOrderPrinting.levelOrder(root).forEach(s -> System.out.print(s + " "));
    }
}
