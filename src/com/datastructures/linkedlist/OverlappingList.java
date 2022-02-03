package com.datastructures.linkedlist;

import java.util.Arrays;
import java.util.List;

public class OverlappingList {

    public Node ovelappingLists(Node L1, Node L2) {
        ListOfNode listOfNode = new ListOfNode();

        Node root1 = listOfNode.hasCycle(L1);
        Node root2 = listOfNode.hasCycle(L2);

        if (root1 == null && root2 == null) {
            return listOfNode.overlapping(L1, L2);
        } else if ((root1 != null && root2 == null) || (root1 == null && root2 != null)) {
            return null;
        }
        Node temp = root2;
        do {
            temp = temp.next;
        } while (temp != root1 && temp != root2);
        if (temp != root1) {
            return null;
        }
        int stem1Length = distance(L1, root1), stem2Length = distance(L2, root2);
        int count = Math.abs(stem1Length - stem2Length);
        if (stem1Length > stem2Length) {
            L1 = ListOfNode.advanceListByK(stem1Length - stem2Length, L1);
        } else {
            L2 = ListOfNode.advanceListByK(stem2Length - stem1Length, L2);
        }
        while (L1 != L2 && L1 != root1 && L2 != root2) {
            L1 = L1.next;
            L2 = L2.next;
        }
        return L1 == L2 ? L1 : L2;
    }

    private static int distance(Node a, Node b) {
        int dis = 0;
        while (a != b) {
            a = a.next;
            ++dis;
        }
        return dis;
    }

    public static void main(String[] args) {
        OverlappingList overlappingList=new OverlappingList();
        ListOfNode listOfNode=new ListOfNode();
       // listOfNode.constructCycle(Arrays.asList(1,2,3,4),4);

        Node L1=new Node(10);
        Node L12=new Node(20);
        L1.next=L12;
        Node L2=new Node(30);
        Node L22=new Node(40);
        L2.next=L22;

        Node L23=new Node(50);
        L22.next=L23;

        Node L24=new Node(60);
        L23.next=L24;

        L24.next=L2;

        L12.next=L22;

       Node result= overlappingList.ovelappingLists(L1,L2);
       if(result==null){
           System.out.println("there is no overlapping");
       }else{
           System.out.println("There is overlapping " +result.data);
       }
       // System.out.println(result.data);

    }
}
