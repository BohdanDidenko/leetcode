package com.leetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveOutermostParenthesesTest {

    @Test
    public void testRemoveOutermostParentheses_Example1() {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String s = "(()())(())";
        String expected = "()()()";
        String actual = solution.removeOuterParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOutermostParentheses_Example2() {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String s = "(()())(())(()(()))";
        String expected = "()()()()(())";
        String actual = solution.removeOuterParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOutermostParentheses_SinglePair() {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String s = "()";
        String expected = "";
        String actual = solution.removeOuterParentheses(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOutermostParentheses_EmptyString() {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String s = "";
        String expected = "";
        String actual = solution.removeOuterParentheses(s);
        assertEquals(expected, actual);
    }
}
