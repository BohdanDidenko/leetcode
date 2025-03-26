package com.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode_NoIntersection() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode headA = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode headB = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertNull(actual);
    }

    @Test
    public void testGetIntersectionNode_Intersection() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode intersection = new ListNode(7, new ListNode(8, new ListNode(9)));
        ListNode headA = new ListNode(1, new ListNode(2, intersection));
        ListNode headB = new ListNode(4, new ListNode(5, intersection));
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertEquals(intersection, actual);
    }

    @Test
    public void testGetIntersectionNode_IntersectionAtHead() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode intersection = new ListNode(7, new ListNode(8, new ListNode(9)));
        ListNode headA = intersection;
        ListNode headB = intersection;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertEquals(intersection, actual);
    }

    @Test
    public void testGetIntersectionNode_NoIntersectionAtHead() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertNull(actual);
    }

    @Test
    public void testGetIntersectionNode_NullHeadA() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode headA = null;
        ListNode headB = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertNull(actual);
    }

    @Test
    public void testGetIntersectionNode_NullHeadB() {
        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode headA = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode headB = null;
        ListNode actual = solution.getIntersectionNode(headA, headB);
        assertNull(actual);
    }
}
