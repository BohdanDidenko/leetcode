package com.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ClearDigits {
    public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pollLast());
        }
        return result.toString();
    }
}
