package com.leetcode.matrix;

public class LargestLocalValuesInMatrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        max = Math.max(max, grid[i + k][j + l]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}
