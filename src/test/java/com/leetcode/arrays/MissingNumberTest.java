package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void testMissingNumber_Example1() {
        MissingNumber solution = new MissingNumber();
        int[] nums = {3, 0, 1};
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_Example2() {
        MissingNumber solution = new MissingNumber();
        int[] nums = {0, 1};
        int expected = 2;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_Example3() {
        MissingNumber solution = new MissingNumber();
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_SingleElementArray() {
        MissingNumber solution = new MissingNumber();
        int[] nums = {0};
        int expected = 1;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber_EmptyArray() {
        MissingNumber solution = new MissingNumber();
        int[] nums = {};
        int expected = 0;
        int actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }
}
