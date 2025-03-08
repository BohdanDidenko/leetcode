package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayInto2DArrayWithConditionsTest {

    @Test
    public void testFindMatrix() {
        ConvertArrayInto2DArrayWithConditions solution = new ConvertArrayInto2DArrayWithConditions();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 3, -1, -3, 5, 6, 7),
                Arrays.asList(3)
        );
        List<List<Integer>> actual = solution.findMatrix(nums);
        assertEquals(expected, actual);
    }
}
