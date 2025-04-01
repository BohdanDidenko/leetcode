package com.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int[] minRow = new int[m];
        for (int i = 0; i < m; i++) {
            int minValue = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
            minRow[i] = minValue;
        }

        int[] maxCol = new int[n];
        for (int j = 0; j < n; j++) {
            int maxValue = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
            maxCol[j] = maxValue;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }
}
