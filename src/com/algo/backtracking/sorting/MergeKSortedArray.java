package com.algo.backtracking.sorting;

import com.datastructures.linkedlist.LinkedListNode;
import com.datastructures.linkedlist.ListOfNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    public LinkedListNode merge_k_listsUsingBruteForce(ArrayList<LinkedListNode> lists) {
        int minIndex;
        LinkedListNode head = null;
        LinkedListNode tail = null;
        while (true) {
            minIndex = Integer.MAX_VALUE;
            for (int i = 0; i < lists.size(); i++) {
                if (lists.get(i) != null) {
                    if (minIndex == Integer.MAX_VALUE || lists.get(i).value < lists.get(minIndex).value) {
                        minIndex = i;
                    }
                }
            }

            if (minIndex == Integer.MAX_VALUE) {
                break;
            }

            if (head == null) {
                head = lists.get(minIndex);
                tail = lists.get(minIndex);
            } else {
                tail.next = lists.get(minIndex);
                tail = tail.next;
            }
            lists.set(minIndex, lists.get(minIndex).next);
            tail.next = null;
        }
        return head;
    }

    private static class ArrayEntry {
        public Integer value;
        public Integer arrayId;

        ArrayEntry(Integer value, Integer arrayId) {
            this.value = value;
            this.arrayId = arrayId;
        }

    }

    public LinkedListNode merge_k_listsUsingHeap(ArrayList<LinkedListNode> lists) {
        LinkedListNode head = null;
        LinkedListNode tail = null;
        PriorityQueue<ArrayEntry> priorityQueue = new PriorityQueue<ArrayEntry>(lists.size(), new Comparator<ArrayEntry>() {
            @Override
            public int compare(ArrayEntry o1, ArrayEntry o2) {
                return Integer.compare(o1.value, o2.value);
            }
        });
        for (int i = 0; i < lists.size(); i++) {
            priorityQueue.add(new ArrayEntry(lists.get(i).value, i));
        }
        while (!priorityQueue.isEmpty()) {
            int index = priorityQueue.poll().arrayId;
            if (head == null) {
                head = lists.get(index);
                tail = lists.get(index);
            } else {
                tail.next = lists.get(index);
                tail = tail.next;
            }
            lists.set(index, lists.get(index).next);
            tail.next = null;
            if (lists.get(index) != null) {
                priorityQueue.add(new ArrayEntry(lists.get(index).value, index));
            }
        }
        return head;
    }

    public LinkedListNode merge_k_listsUsingDivideAndConquer(ArrayList<LinkedListNode> lists) {

        int last = lists.size() - 1;

        while (last != 0) {
            int low = 0;
            int high = last;
            while (low < high) {
             lists.set(low,mergeTwoList(lists.get(low),lists.get(high)));
             low++;
             high--;
            }
            last=high;
        }
        return lists.get(0);
    }

    public LinkedListNode mergeTwoList(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode tail = dummy;

        while (head1 != null || head2 != null) {

            if (head1 == null) {
                tail.next = head2;
                head2 = head2.next;
            } else if (head2 == null) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                if (head1.value < head2.value) {
                    tail.next = head1;
                    head1 = head1.next;
                } else {
                    tail.next = head2;
                    head2 = head2.next;
                }
            }
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ArrayList<LinkedListNode> input = new ArrayList<>();
        LinkedListNode one = new LinkedListNode(1);
        LinkedListNode three = new LinkedListNode(3);
        LinkedListNode five = new LinkedListNode(5);
        one.next = three;
        three.next = five;
        input.add(one);
        LinkedListNode three1 = new LinkedListNode(3);
        LinkedListNode four = new LinkedListNode(4);
        three1.next = four;
        input.add(three1);
        LinkedListNode seven = new LinkedListNode(7);
        input.add(seven);
        MergeKSortedArray mergeKSortedArray = new MergeKSortedArray();
      //  mergeKSortedArray.merge_k_listsUsingHeap(input);
        mergeKSortedArray.merge_k_listsUsingDivideAndConquer(input);
    }
}
