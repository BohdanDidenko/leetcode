package com.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class FinalArrayStateAfterKMultiplications {

    public int[] getFinalStateOption1(int[] nums, int k, int multiplier) {
        Queue<Integer> queue = new PriorityQueue<>((i, j) -> {
            if (nums[i] == nums[j]) {
                return i - j;
            }
            return Integer.compare(nums[i], nums[j]);
        });
        for (int i = 0; i < nums.length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < k; i++) {
            int minIndex = queue.poll();
            nums[minIndex] *= multiplier;
            queue.add(minIndex);
        }
        return nums;
    }

    public int[] getFinalStateOption2(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}
