package com.leetcode.matrix;

public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        int maxCount = 0;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (sum > maxCount) {
                result[0] = i;
                result[1] = sum;
                maxCount = sum;
            }
        }
        return result;
    }
}
