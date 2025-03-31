package com.leetcode.prefix_sum;

public class FindScoreOfAllPrefixesOfArray {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        long maxVal = 0;
        long score = 0;

        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            score += nums[i] + maxVal;
            ans[i] = score;
        }

        return ans;
    }
}
