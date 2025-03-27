package com.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertGreatestCommonDivisorsInLinkedListTest {

    @Test
    public void testInsertGreatestCommonDivisorsInLinkedList_SimpleCase() {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = new ListNode(2, new ListNode(6));
        ListNode expected = new ListNode(2, new ListNode(2, new ListNode(6)));
        ListNode actual = solution.insertGreatestCommonDivisors(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
    }

    @Test
    public void testInsertGreatestCommonDivisorsInLinkedList_MultipleNodes() {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = new ListNode(2, new ListNode(6, new ListNode(12)));
        ListNode expected = new ListNode(2, new ListNode(2, new ListNode(6, new ListNode(6, new ListNode(12)))));
        ListNode actual = solution.insertGreatestCommonDivisors(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
    }

    @Test
    public void testInsertGreatestCommonDivisorsInLinkedList_NoInsertion() {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = new ListNode(2);
        ListNode expected = new ListNode(2);
        ListNode actual = solution.insertGreatestCommonDivisors(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next, actual.next);
    }

    @Test
    public void testInsertGreatestCommonDivisorsInLinkedList_NullHead() {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = null;
        ListNode actual = solution.insertGreatestCommonDivisors(head);
        assertEquals(null, actual);
    }

    @Test
    public void testInsertGreatestCommonDivisorsInLinkedList_SingleNode() {
        InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = new ListNode(2);
        ListNode expected = new ListNode(2);
        ListNode actual = solution.insertGreatestCommonDivisors(head);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.next, actual.next);
    }
}
