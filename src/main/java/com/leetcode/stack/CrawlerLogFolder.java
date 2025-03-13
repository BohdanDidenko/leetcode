package com.leetcode.stack;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int depth = 0;
        String up = "../";
        String current = "./";
        for (String log : logs) {
            if ((up.equals(log) && depth == 0) || current.equals(log)) {
                continue;
            } else if (up.equals(log) && depth > 0) {
                depth--;
            } else {
                depth++;
            }
        }
        return depth;
    }
}
