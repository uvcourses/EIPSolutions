package com.datastructures.linkedlist;

import java.util.Arrays;

public class ReverseLinkedList {

    public Node reverseList(Node node) {
        Node prev=null;
        Node current=node;

        while (current.next!=null) {
            Node temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        current.next=prev;
        return current;
    }
    public Node reverseSubList(Node node,int start,int finish){
        Node dummyHead=new Node(0);
        dummyHead.next=node;

        Node subListHead=dummyHead;
        while(start-- >0) {
            subListHead=subListHead.next;
        }

        Node subListIter=subListHead.next;
        while(finish-- > start){
            Node temp=subListIter.next;
            subListIter.next=temp.next;
            temp.next=subListIter;
            subListHead.next=temp;
        }
        return null;
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListOfNode listOfNode = new ListOfNode();
        Node l1 = listOfNode.constructNode(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9));
       // Node result = reverseLinkedList.reverseList(l1);
        Node result=reverseLinkedList.reverseSubList(l1,3,5);
        listOfNode.printList(result, "Reversed List :: ");
    }
}
