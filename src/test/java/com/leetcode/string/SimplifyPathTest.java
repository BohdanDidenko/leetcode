package com.leetcode.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {

    @Test
    public void testSimplifyPath_Example1() {
        SimplifyPath solution = new SimplifyPath();
        String path = "/home/";
        String expected = "/home";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_Example2() {
        SimplifyPath solution = new SimplifyPath();
        String path = "/../";
        String expected = "/";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_Example3() {
        SimplifyPath solution = new SimplifyPath();
        String path = "/home//foo/";
        String expected = "/home/foo";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_EmptyPath() {
        SimplifyPath solution = new SimplifyPath();
        String path = "";
        String expected = "/";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_NullPath() {
        SimplifyPath solution = new SimplifyPath();
        String path = null;
        try {
            solution.simplifyPath(path);
            assert false; // Should throw NullPointerException
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    public void testSimplifyPath_SingleDot() {
        SimplifyPath solution = new SimplifyPath();
        String path = "/./";
        String expected = "/";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_DoubleDot() {
        SimplifyPath solution = new SimplifyPath();
        String path = "/../";
        String expected = "/";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimplifyPath_MultipleSlashes() {
        SimplifyPath solution = new SimplifyPath();
        String path = "//home//foo//";
        String expected = "/home/foo";
        String actual = solution.simplifyPath(path);
        assertEquals(expected, actual);
    }
}