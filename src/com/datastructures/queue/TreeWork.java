package com.datastructures.queue;

import com.datastructures.tree.TreeNode;

import java.util.Stack;

public class TreeWork
{


    /* This function is here just to test  */
    static void preOrder(TreeNode node)
    {
        if (node == null)
            return;
        System.out.printf("%d ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    // function to return the index of close parenthesis
    static int findIndex(String str, int si, int ei)
    {
        if (si > ei)
            return -1;

        // Inbuilt stack
        Stack<Character> s = new Stack<>();
        for (int i = si; i <= ei; i++)
        {

            // if open parenthesis, push it
            if (str.charAt(i) == '(')
                s.add(str.charAt(i));

                // if close parenthesis
            else if (str.charAt(i) == ')')
            {
                if (s.peek() == '(')
                {
                    s.pop();

                    // if stack is empty, this is
                    // the required index
                    if (s.isEmpty())
                        return i;
                }
            }
        }

        // if not found return -1
        return -1;
    }

    public TreeNode constructTree(){
        TreeNode rootTree=new TreeNode(314);
        TreeNode node6left=new TreeNode(6);
        TreeNode node6right=new TreeNode(6);
        rootTree.left=node6left;
        rootTree.right=node6right;

        TreeNode node271left=new TreeNode(271);
        TreeNode node561=new TreeNode(561);
        node6left.left=node271left;
        node6left.right=node561;

        TreeNode node2=new TreeNode(2);
        TreeNode node271right=new TreeNode(271);
        node6right.left=node2;
        node6right.right=node271right;

        node271left.left=new TreeNode(28);
        node271left.right=new TreeNode(0);

        TreeNode node3=new TreeNode(3);
        node561.right=node3;

        node3.left=new TreeNode(17);

        node271right.right=new TreeNode(28);
        TreeNode nodeOne=new TreeNode(1);
        node2.right=nodeOne;

        TreeNode node401=new TreeNode(401);
        TreeNode node257=new TreeNode(257);
        nodeOne.left=node401;
        nodeOne.right=node257;

        node401.right=new TreeNode(641);


        return rootTree;
    }

    // function to construct tree from String
    public TreeNode treeFromString(String str, int si, int ei)
    {

        // Base case
        if (si > ei)
            return null;

        // new root
        TreeNode root = new TreeNode(str.charAt(si) - '0');
        int index = -1;

        // if next char is '(' find the index of
        // its complement ')'
        if (si + 1 <= ei && str.charAt(si+1) == '(')
            index = findIndex(str, si + 1, ei);

        // if index found
        if (index != -1)
        {

            // call for left subtree
            root.left = treeFromString(str, si + 2, index - 1);

            // call for right subtree
            root.right
                    = treeFromString(str, index + 2, ei - 1);
        }
        return root;
    }

    // Driver Code
    public static void main(String[] args)
    {
        //String str = "4(2(3)(1))(6(5))";
        String str="314(6(271(28))(561()(3(17))))(6(2(1(401(641))(257)))(271(28)))";
        TreeWork treeWork=new TreeWork();
        //TreeNode root = treeWork.treeFromString(str, 0, str.length() - 1);
        TreeNode root=treeWork.constructTree();
        preOrder(root);
    }


}
