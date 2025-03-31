package com.leetcode.matrix;

import java.util.HashMap;
import java.util.Map;

class NeighborSum {
    private int[][] grid;
    private Map<Integer, int[]> valueToCoordinates;
    private int n;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.valueToCoordinates = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valueToCoordinates.put(grid[i][j], new int[]{i, j});
            }
        }
    }

    public int adjacentSum(int value) {
        int[] coordinates = valueToCoordinates.get(value);
        int row = coordinates[0];
        int col = coordinates[1];
        int sum = 0;

        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(newRow, newCol)) {
                sum += grid[newRow][newCol];
            }
        }

        return sum;
    }

    public int diagonalSum(int value) {
        int[] coordinates = valueToCoordinates.get(value);
        int row = coordinates[0];
        int col = coordinates[1];
        int sum = 0;

        int[][] directions = {
                {-1, -1},
                {-1, 1},
                {1, -1},
                {1, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(newRow, newCol)) {
                sum += grid[newRow][newCol];
            }
        }

        return sum;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }
}
