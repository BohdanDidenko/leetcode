package com.leetcode.linked_list;

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 0; i < size / 2; i++) {
            curr = curr.next;
        }
        return curr;
    }
}
