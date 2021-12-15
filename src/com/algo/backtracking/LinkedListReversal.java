package com.algo.backtracking;

public class LinkedListReversal {

    public Node reversal(Node node){

        if(node==null || node.next==null){
            return node;
        }
        Node p=reversal(node.next);
        node.next.next=node;
        node.next=null;
        return p;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node first=new Node(2);
        head.next=first;
        Node second=new Node(3);
        first.next=second;
        Node third=new Node(4);
        second.next=third;
        Node fourth=new Node(5);
        third.next=fourth;
        Node fifth=new Node(6);
        fourth.next=fifth;
        LinkedListReversal linkedListReversal=new LinkedListReversal();
        System.out.println("Before Reverse");
        linkedListReversal.printData(head);
        System.out.println("After Reversal");
        linkedListReversal.printData(linkedListReversal.reversal(head));

    }

    private void printData(Node data){
       while(data!=null){
           System.out.print(data.data);
           data=data.next;
       }
        System.out.println("");
    }
}
