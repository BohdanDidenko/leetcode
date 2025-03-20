package com.leetcode.string;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
    public static final String SLASH = "/";
    public static final String SINGLE_PERIOD  = ".";
    public static final String DOUBLE_PERIOD = "..";
    public static final String EMPTY = "";

    public static String simplifyPath(String path) {
        String[] splitPath = path.split(SLASH);
        Deque<String> deque = new LinkedList<>();

        for (String s : splitPath)  {
            if (DOUBLE_PERIOD.equals(s) && !deque.isEmpty()) {
                deque.pollLast();
            } else if (EMPTY.equals(s) || SINGLE_PERIOD.equals(s) || DOUBLE_PERIOD.equals(s)) {
                continue;
            } else {
                deque.add(s);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : deque) {
            result.append(SLASH).append(dir);
        }
        return !result.isEmpty() ? result.toString() : SLASH;
    }
}
