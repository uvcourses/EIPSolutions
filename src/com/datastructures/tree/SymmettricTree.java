package com.datastructures.tree;

public class SymmettricTree {
    public boolean findSymmettric(BinaryTreeNode root) {
        return findSymmettric(root.left, root.right);
    }

    public boolean findSymmettric(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else if ((tree1 == null && tree2 != null) || (tree1 != null && tree2 == null)) {
            return false;
        } else {
            return tree1.data == tree2.data && findSymmettric(tree1.left, tree2.right)
                    && findSymmettric(tree1.right, tree2.left);
        }
    }

    public static void main(String[] args) {
        SymmettricTree symmettricTree = new SymmettricTree();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(314);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> node6r = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node2r = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> node3r = new BinaryTreeNode<>(3);

        root.left = node6;
        root.right = node6r;
        node6.right = node2;
        node2.right = node3;

        node6r.left = node2r;
        node2r.left = node3r;
        // BinaryTreeNode<Integer> root=new BinaryTreeNode<>(314);
        // BinaryTreeNode<Integer> root=new BinaryTreeNode<>(314);
        System.out.println(symmettricTree.findSymmettric(root));
    }
}
