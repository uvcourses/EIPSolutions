package com.datastructures;

import java.util.*;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public void addEdge(Node to) {
        neighbors.add(to);
    }

    public static void dfs(Node start, Set<Integer> visited) {
        visited.add(start.val);
        System.out.println(start.val + " ");

        for (Node adj : start.neighbors) {
            if (!visited.contains(adj.val)) {
                dfs(adj, visited);
            }
        }
    }

    public static void bfs(Node start) {
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start.val);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.val + " ");

            for (Node n : current.neighbors) {
                if (!visited.contains(n.val)) {
                    queue.add(n);
                    visited.add(n.val);
                }
            }
        }
    }


    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node0.addEdge(node1);
        node1.addEdge(node0);
        node1.addEdge(node2);
        node1.addEdge(node3);
        node2.addEdge(node1);
        node2.addEdge(node4);
        node3.addEdge(node1);
        node3.addEdge(node4);
        node3.addEdge(node5);
        node4.addEdge(node2);
        node4.addEdge(node3);
        node5.addEdge(node3);
        System.out.println("BFS :::::::");
        bfs(node5);
        System.out.println("DFS :::::::");

        dfs(node0, new HashSet<>());

    }
}
