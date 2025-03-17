package com.leetcode.heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalArrayStateAfterKMultiplicationsTest {

    @Test
    public void testGetFinalStateOption1_NoMultiplications() {
        FinalArrayStateAfterKMultiplications solution = new FinalArrayStateAfterKMultiplications();
        int[] nums = {1, 2, 3, 4};
        int k = 0;
        int multiplier = 2;
        int[] expected = {1, 2, 3, 4};
        int[] actual = solution.getFinalStateOption1(nums, k, multiplier);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFinalStateOption1_SingleElementArray() {
        FinalArrayStateAfterKMultiplications solution = new FinalArrayStateAfterKMultiplications();
        int[] nums = {5};
        int k = 2;
        int multiplier = 2;
        int[] expected = {20};
        int[] actual = solution.getFinalStateOption1(nums, k, multiplier);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFinalStateOption2_NoMultiplications() {
        FinalArrayStateAfterKMultiplications solution = new FinalArrayStateAfterKMultiplications();
        int[] nums = {1, 2, 3, 4};
        int k = 0;
        int multiplier = 2;
        int[] expected = {1, 2, 3, 4};
        int[] actual = solution.getFinalStateOption2(nums, k, multiplier);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFinalStateOption2_SingleElementArray() {
        FinalArrayStateAfterKMultiplications solution = new FinalArrayStateAfterKMultiplications();
        int[] nums = {5};
        int k = 2;
        int multiplier = 2;
        int[] expected = {20};
        int[] actual = solution.getFinalStateOption2(nums, k, multiplier);
        assertArrayEquals(expected, actual);
    }
}