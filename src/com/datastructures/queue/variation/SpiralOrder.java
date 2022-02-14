package com.datastructures.queue.variation;

import com.datastructures.queue.TreeLevelOrderPrinting;
import com.datastructures.tree.TreeNode;
import com.datastructures.tree.TreeWork;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class SpiralOrder {
    public List<List<Integer>> spiralOrder(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> currentDepth = new ArrayDeque<>();
        currentDepth.addFirst(treeNode);
        boolean flag = true;
        while (!currentDepth.isEmpty()) {
            Deque<TreeNode> nextNode = new LinkedList<>();
            List<Integer> level = new ArrayList<>();
            while (!currentDepth.isEmpty()) {
                TreeNode currentNode;
                if (flag) {
                    currentNode = currentDepth.pollLast();
                } else {
                    currentNode = currentDepth.pollLast();
                }
                //currentNode = nextNodeStack.pollFirst();
                if (currentNode != null) {
                    level.add(currentNode.data);
                }
                if (flag) {
                    if (currentNode.right != null)
                        nextNode.add(currentNode.right);
                    if (currentNode.left != null)
                        nextNode.add(currentNode.left);
                } else {
                    if (currentNode.left != null)
                        nextNode.add(currentNode.left);
                    if (currentNode.right != null)
                        nextNode.add(currentNode.right);
                }
            }
            result.add(level);
            currentDepth = nextNode;
            if (flag)
                flag = false;
            else
                flag = true;
        }
        return result;
    }

    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();
        TreeWork treeWork = new TreeWork();
        //TreeNode root = treeWork.treeFromString(str, 0, str.length() - 1);
        TreeNode root = treeWork.constructTree();
        spiralOrder.spiralOrder(root).forEach(s -> System.out.print(s + " "));
    }
}
