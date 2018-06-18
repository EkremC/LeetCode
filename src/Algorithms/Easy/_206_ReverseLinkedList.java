package Algorithms.Easy;

// https://leetcode.com/problems/reverse-linked-list/description/
public class _206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}

/*class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}*/
