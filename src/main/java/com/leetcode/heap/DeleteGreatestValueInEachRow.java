package com.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Integer>[] maxHeaps = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            maxHeaps[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int val : grid[i]) {
                maxHeaps[i].offer(val);
            }
        }

        int result = 0;
        for (int step = 0; step < n; step++) {
            int maxInThisStep = 0;
            for (int i = 0; i < m; i++) {
                int maxVal = maxHeaps[i].poll();
                maxInThisStep = Math.max(maxInThisStep, maxVal);
            }
            result += maxInThisStep;
        }
        return result;
    }
}
