package com.leetcode.heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopXFrequencySumCalculatorTest {

    private final TopXFrequencySumCalculator calculator = new TopXFrequencySumCalculator();

    @Test
    public void testExample1() {
        int[] nums = {1, 1, 2, 2, 3, 4, 2, 3};
        int k = 6;
        int x = 2;
        int[] expected = {6, 10, 12};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Example 1 failed: " + Arrays.toString(result));
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 8, 7, 8, 7, 5};
        int k = 2;
        int x = 2;
        int[] expected = {11, 15, 15, 15, 12};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Example 2 failed: " + Arrays.toString(result));
    }

    @Test
    public void testWhenSizeEqualsX() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int x = 3;
        int[] expected = {6, 9, 12};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test when size equals x failed");
    }

    @Test
    public void testWhenSizeLessThanX() {
        int[] nums = {1, 2, 3, 1, 2};
        int k = 3;
        int x = 5;
        int[] expected = {6, 6, 6};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test when size less than x failed");
    }

    @Test
    public void testWithOnlyOneDistinctElement() {
        int[] nums = {5, 5, 5, 5, 5};
        int k = 3;
        int x = 1;
        int[] expected = {15, 15, 15};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test with only one distinct element failed");
    }

    @Test
    public void testWithMinimumValues() {
        int[] nums = {1};
        int k = 1;
        int x = 1;
        int[] expected = {1};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test with minimum values failed");
    }

    @Test
    public void testWithMaxFrequencyElementLowerValue() {
        int[] nums = {1, 1, 1, 5, 5};
        int k = 5;
        int x = 1;
        int[] expected = {3};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test with max frequency element having lower value failed");
    }

    @Test
    public void testWithMaxWindowSize() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        int x = 3;
        int[] expected = {12};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test with max window size failed");
    }

    @Test
    public void testWithTieBreakingByValue() {
        int[] nums = {3, 3, 2, 2, 1, 1};
        int k = 6;
        int x = 2;
        int[] expected = {10};
        int[] result = calculator.findXSum(nums, k, x);

        assertArrayEquals(expected, result, "Test with tie breaking by value failed");
    }
}
