package com.leetcode.matrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LargestLocalValuesInMatrixTest {

    @Test
    public void testLargestLocal_SimpleCase() {
        LargestLocalValuesInMatrix solution = new LargestLocalValuesInMatrix();
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };
        int[][] expected = {
                {9, 9},
                {8, 6}
        };
        int[][] actual = solution.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLargestLocal_SingleValue() {
        LargestLocalValuesInMatrix solution = new LargestLocalValuesInMatrix();
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        int[][] expected = {
                {1, 1},
                {1, 1}
        };
        int[][] actual = solution.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLargestLocal_NoLocalMax() {
        LargestLocalValuesInMatrix solution = new LargestLocalValuesInMatrix();
        int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] expected = {
                {11, 12},
                {15, 16}
        };
        int[][] actual = solution.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLargestLocal_LocalMaxAtBorder() {
        LargestLocalValuesInMatrix solution = new LargestLocalValuesInMatrix();
        int[][] grid = {
                {16, 15, 14, 13},
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };
        int[][] expected = {
                {16, 15},
                {12, 11}
        };
        int[][] actual = solution.largestLocal(grid);
        assertArrayEquals(expected, actual);
    }
}
