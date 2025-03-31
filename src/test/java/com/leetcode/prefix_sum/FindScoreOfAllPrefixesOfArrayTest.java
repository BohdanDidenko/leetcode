package com.leetcode.prefix_sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindScoreOfAllPrefixesOfArrayTest {

    @Test
    public void testFindPrefixScore_SingleElement() {
        FindScoreOfAllPrefixesOfArray solution = new FindScoreOfAllPrefixesOfArray();
        int[] nums = {5};
        long[] expected = {10};
        long[] actual = solution.findPrefixScore(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrefixScore_NoIncrease() {
        FindScoreOfAllPrefixesOfArray solution = new FindScoreOfAllPrefixesOfArray();
        int[] nums = {5, 5, 5, 5};
        long[] expected = {10, 20, 30, 40};
        long[] actual = solution.findPrefixScore(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrefixScore_Increasing() {
        FindScoreOfAllPrefixesOfArray solution = new FindScoreOfAllPrefixesOfArray();
        int[] nums = {1, 2, 3, 4, 5};
        long[] expected = {2, 6, 12, 20, 30};
        long[] actual = solution.findPrefixScore(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindPrefixScore_EmptyArray() {
        FindScoreOfAllPrefixesOfArray solution = new FindScoreOfAllPrefixesOfArray();
        int[] nums = {};
        long[] expected = {};
        long[] actual = solution.findPrefixScore(nums);
        assertArrayEquals(expected, actual);
    }
}
