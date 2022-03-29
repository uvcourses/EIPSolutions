package com.datastructures.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PostOrderTraversal {
    static ArrayList<Integer> postorder_traversal(BinaryTreeNode root) {
        // Write your code here.
        Deque<BinaryTreeNode> stack = new ArrayDeque<BinaryTreeNode>();
        Deque<Integer> inter = new ArrayDeque<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        stack.addFirst(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.poll();
            inter.addFirst(node.data);
            if (node.right != null)
                stack.addFirst(node.right);

            if (node.left != null)
                stack.addFirst(node.left);

        }

        while(!inter.isEmpty()){
            result.add(inter.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer>  root=new BinaryTreeNode<>(400);
        BinaryTreeNode<Integer> left=new BinaryTreeNode<>(200);
        BinaryTreeNode<Integer> right=new BinaryTreeNode<>(300);

        BinaryTreeNode<Integer> left1=new BinaryTreeNode<>(100);
        BinaryTreeNode<Integer> right1=new BinaryTreeNode<>(400);



        root.left=left;
        root.right=right;

        left.left=left1;
        right.right=right1;

        postorder_traversal(root);
    }
}
