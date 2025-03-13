package com.leetcode.stack;

public class CustomStack {
    private final int[] stack;
    private int top = 0;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if (top < stack.length) {
            stack[top++] = x;
        }
    }

    public int pop() {
        if (top != 0) {
            return stack[--top];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, top);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}
