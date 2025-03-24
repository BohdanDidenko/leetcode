package com.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodeTest {

    @Test
    public void testMiddleNode_Example1() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode actual = solution.middleNode(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next, actual.next.next.next);
    }

    @Test
    public void testMiddleNode_Example2() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(3, new ListNode(4));
        ListNode actual = solution.middleNode(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next, actual.next.next);
    }

    @Test
    public void testMiddleNode_SingleElement() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);
        ListNode actual = solution.middleNode(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next, actual.next);
    }

    @Test
    public void testMiddleNode_TwoElements() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2);
        ListNode actual = solution.middleNode(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next, actual.next);
    }

    @Test
    public void testMiddleNode_NullHead() {
        Solution solution = new Solution();
        ListNode head = null;
        ListNode actual = solution.middleNode(head);
        assertEquals(null, actual);
    }
}
