package com.leetcode.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RowWithMaximumOnesTest {

    @Test
    public void testRowAndMaximumOnes_SimpleCase() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {
                {0, 1, 1, 1},
                {0, 0, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
        };
        int[] expected = {0, 3};
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }

    @Test
    public void testRowAndMaximumOnes_MultipleMaxRows() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {
                {1, 1, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[] expected = {0, 3};
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }

    @Test
    public void testRowAndMaximumOnes_NoOnes() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }

    @Test
    public void testRowAndMaximumOnes_SingleRow() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {
                {1, 1, 1}
        };
        int[] expected = {0, 3};
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }

    @Test
    public void testRowAndMaximumOnes_SingleColumn() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {
                {1},
                {1},
                {1}
        };
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }

    @Test
    public void testRowAndMaximumOnes_EmptyMatrix() {
        RowWithMaximumOnes solution = new RowWithMaximumOnes();
        int[][] mat = {};
        int[] expected = new int[2];
        assertArrayEquals(expected, solution.rowAndMaximumOnes(mat));
    }
}
