package ru.akhloptsev.LinkedList.LinkedListMiddle;

import ru.akhloptsev.LinkedList.ListNode;

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode node = head, middleNode = head;
        while (node.next!=null){
            node = node.next;
            if (node.next == null){
                middleNode = middleNode.next;
                break;
            } else {
                node = node.next;
                middleNode = middleNode.next;
            }
        }
        return middleNode;
    }
}
