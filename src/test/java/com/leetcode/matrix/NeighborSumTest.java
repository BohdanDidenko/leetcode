package com.leetcode.matrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighborSumTest {

    @Test
    public void testAdjacentSum_SimpleCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(20, solution.adjacentSum(5));
    }

    @Test
    public void testAdjacentSum_CornerCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(6, solution.adjacentSum(1));
    }

    @Test
    public void testAdjacentSum_EdgeCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(9, solution.adjacentSum(2));
    }

    @Test
    public void testDiagonalSum_SimpleCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(20, solution.diagonalSum(5));
    }

    @Test
    public void testDiagonalSum_CornerCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(5, solution.diagonalSum(1));
    }

    @Test
    public void testDiagonalSum_EdgeCase() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        assertEquals(10, solution.diagonalSum(2));
    }

    @Test
    public void testInvalidValue() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        NeighborSum solution = new NeighborSum(grid);
        try {
            solution.adjacentSum(10);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }
}
