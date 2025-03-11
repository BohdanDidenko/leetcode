package com.leetcode.stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder stack = new StringBuilder();
        int depth = 0;
        char open = '(';
        char close = ')';
        for (char c : s.toCharArray()) {
            if (c == open) {
                if (depth > 0) {
                    stack.append(open);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    stack.append(close);
                }
            }
        }
        return stack.toString();
    }
}
