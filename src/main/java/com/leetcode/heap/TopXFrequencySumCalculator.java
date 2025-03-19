package com.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopXFrequencySumCalculator {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                countMap.put(nums[j], countMap.getOrDefault(nums[j], 0) + 1);
            }

            if (countMap.size() <= x) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += nums[j];
                }
                answer[i] = sum;
                continue;
            }

            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
                if (a.getValue() != b.getValue()) {
                    return b.getValue() - a.getValue();
                }
                return b.getKey() - a.getKey();
            });

            pq.addAll(countMap.entrySet());

            int xSum = 0;
            for (int j = 0; j < x && !pq.isEmpty(); j++) {
                Map.Entry<Integer, Integer> entry = pq.poll();
                xSum += entry.getKey() * entry.getValue();
            }
            answer[i] = xSum;
        }
        return answer;
    }
}
