package com.datastructures.queue.variation;

import com.datastructures.tree.TreeNode;
import com.datastructures.tree.TreeWork;

import java.util.*;

public class SpiralOrder {
    public List<List<Integer>> spiralOrder(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> currentDepth = new ArrayDeque<>();
        currentDepth.addFirst(treeNode);
        boolean flag = true;
        while (!currentDepth.isEmpty()) {
            Deque<TreeNode> nextNode = new LinkedList<>();
            LinkedList<Integer> level = new LinkedList<>();
            while (!currentDepth.isEmpty()) {
                TreeNode currentNode;
                currentNode = currentDepth.pollFirst();
                //currentNode = nextNodeStack.pollFirst();
                if (flag) {
                    if (currentNode != null) {
                        level.addLast(currentNode.data);
                    }
                } else {
                    if (currentNode != null) {
                        level.addFirst(currentNode.data);
                    }
                }
                if (currentNode.left != null)
                    nextNode.add(currentNode.left);
                if (currentNode.right != null)
                    nextNode.add(currentNode.right);
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
