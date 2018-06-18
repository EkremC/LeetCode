package Algorithms.Easy;

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class _237_DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

