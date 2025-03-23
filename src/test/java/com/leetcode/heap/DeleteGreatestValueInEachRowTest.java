package com.leetcode.heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteGreatestValueInEachRowTest {

    @Test
    public void testDeleteGreatestValueInEachRow() {
        DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        int[][] grid = {{10}};
        int expected = 10;
        int actual = solution.deleteGreatestValue(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteGreatestValueInEachRow_GridWithOneColumn() {
        DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();
        int[][] grid = {{1}, {2}, {3}};
        int expected = 3;
        int actual = solution.deleteGreatestValue(grid);
        assertEquals(expected, actual);
    }
}
