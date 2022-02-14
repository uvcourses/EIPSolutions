package com.datastructures.queue.variation;

import com.datastructures.tree.TreeNode;
import com.datastructures.tree.TreeWork;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageOfEachLevel {
    public List<Float> averageNode(TreeNode root) {
        List<Float> result = new LinkedList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            float count = 0;
            int totalSum = 0;
            Deque<TreeNode> nextNode = new LinkedList<>();

            while (!deque.isEmpty()) {
                TreeNode currrentNode = deque.pollFirst();
                if (currrentNode != null) {
                    count++;
                    totalSum += currrentNode.data;
                }
                if (currrentNode.left != null) {
                    nextNode.add(currrentNode.left);
                }
                if (currrentNode.right != null) {
                    nextNode.add(currrentNode.right);
                }
            }
            result.add(totalSum / count);
            deque = nextNode;
        }
        return result;
    }

    public static void main(String[] args) {
        AverageOfEachLevel averageOfEachLevel = new AverageOfEachLevel();
        TreeWork treeWork = new TreeWork();
        //TreeNode root = treeWork.treeFromString(str, 0, str.length() - 1);
        TreeNode root = treeWork.constructTree();
        averageOfEachLevel.averageNode(root).forEach(s -> System.out.print(s + " "));
    }
}
