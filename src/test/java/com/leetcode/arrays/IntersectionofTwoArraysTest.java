package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class IntersectionofTwoArraysTest {

    @Test
    public void testIntersection() {
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        int[] actual = solution.intersection(nums1, nums2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersection_NoIntersection() {
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] expected = {};
        int[] actual = solution.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersection_DuplicateElements() {
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 2, 3, 3};
        int[] expected = {2, 3};
        int[] actual = solution.intersection(nums1, nums2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersection_EmptyArrays() {
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        int[] actual = solution.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}
