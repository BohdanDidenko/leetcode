package com.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveLinkedListElementsTest {

    @Test
    public void testRemoveElements_SimpleCase() {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode actual = solution.removeElements(head, 6);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
    }

    @Test
    public void testRemoveElements_RemoveHead() {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode head = new ListNode(6, new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode actual = solution.removeElements(head, 6);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
    }

    @Test
    public void testRemoveElements_RemoveAll() {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode head = new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(6))))));
        ListNode actual = solution.removeElements(head, 6);
        assertNull(actual);
    }

    @Test
    public void testRemoveElements_NoRemove() {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode actual = solution.removeElements(head, 6);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
    }

    @Test
    public void testRemoveElements_NullHead() {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode head = null;
        ListNode actual = solution.removeElements(head, 6);
        assertNull(actual);
    }
}
