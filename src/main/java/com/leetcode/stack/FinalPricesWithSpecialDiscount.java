package com.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class FinalPricesWithSpecialDiscount {

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
            result[i] = prices[i];
        }
        return result;
    }
}
