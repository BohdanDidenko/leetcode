package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThirdMaximumNumberTest {

    @Test
    public void testThirdMax() {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int[] nums = {3, 2, 1};
        int expected = 1;
        int actual = solution.thirdMax(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testThirdMax_NoThirdMax() {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int[] nums = {2, 2, 3, 1};
        int expected = 1;
        int actual = solution.thirdMax(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testThirdMax_DuplicateElements() {
        ThirdMaximumNumber solution = new ThirdMaximumNumber();
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 1;
        int actual = solution.thirdMax(nums);
        assertEquals(expected, actual);
    }
}
