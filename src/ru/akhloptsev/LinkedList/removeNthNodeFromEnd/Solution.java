package ru.akhloptsev.LinkedList.removeNthNodeFromEnd;

import ru.akhloptsev.LinkedList.ListNode;

public class Solution {

    public static void main(String[] args) {
      //  ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode head = new ListNode(1);//, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        removeNthFromEnd(head, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next!= null ){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
