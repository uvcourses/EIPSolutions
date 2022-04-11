package com.datastructures.graph;

import com.datastructures.Node;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponent {
    List<Node> graph=new ArrayList<>();
    public void addEdge(int source,int destination){
        Node temp=new Node(destination);

    }

    public void addVertex(int vertex){
        Node temp=new Node(vertex);
        graph.add(temp);
    }

    public static void main(String[] args) {
        ConnectedComponent connectedComponent=new ConnectedComponent();
        int n=5;
        connectedComponent.addVertex(1);
        connectedComponent.addVertex(2);
        connectedComponent.addVertex(3);
        connectedComponent.addVertex(4);
        connectedComponent.addVertex(5);
        connectedComponent.addVertex(6);


    }
}
