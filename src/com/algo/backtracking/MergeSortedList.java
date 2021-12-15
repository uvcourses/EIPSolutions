package com.algo.backtracking;

public class MergeSortedList {

    public Node mergeList(Node A,Node B){
        if(A==null) return B;
        if(B==null) return A;
        if(A.data < B.data) {
            A.next = mergeList(A.next, B);
            return A;
        }
        else{
            B.next = mergeList(A, B.next);
            return B;
        }
    }

    public static void main(String[] args) {
        Node A=new Node(1);
        Node first=new Node(3);
        A.next=first;
        Node second=new Node(5);
        first.next=second;
        Node third=new Node(7);
        second.next=third;
        Node fourth=new Node(9);
        third.next=fourth;
        Node fifth=new Node(11);
        fourth.next=fifth;


        Node B=new Node(2);
        Node first1=new Node(4);
        B.next=first1;
        Node second1=new Node(6);
        first1.next=second1;
        Node third1=new Node(8);
        second1.next=third1;
        Node fourth1=new Node(10);
        third1.next=fourth1;
        Node fifth1=new Node(12);
        fourth1.next=fifth1;

        MergeSortedList mergeSortedList=new MergeSortedList();
        Node head=mergeSortedList.mergeList(A,B);
        mergeSortedList.printList(head);

    }

    private void printList(Node node){
        System.out.println("After Merging");
        while(node!=null){
            System.out.print(node.data);
            node=node.next;
        }
    }
}
