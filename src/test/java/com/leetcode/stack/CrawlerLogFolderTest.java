package com.leetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrawlerLogFolderTest {

    @Test
    public void testMinOperations_Example1() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        int expected = 2;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinOperations_Example2() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        int expected = 3;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinOperations_OnlyForward() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {"d1/", "d2/", "d3/", "d4/"};
        int expected = 4;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinOperations_OnlyBackward() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {"../", "../", "../", "../"};
        int expected = 0;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinOperations_NoOperations() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {"./", "./", "./", "./"};
        int expected = 0;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinOperations_EmptyArray() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = {};
        int expected = 0;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }
}
