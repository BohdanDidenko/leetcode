package com.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClearDigitsTest {

    @Test
    public void testClearDigits_NoDigits() {
        ClearDigits clearDigits = new ClearDigits();
        String input = "abc";
        String expected = "abc";
        String actual = clearDigits.clearDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testClearDigits_OnlyDigits() {
        ClearDigits clearDigits = new ClearDigits();
        String input = "123";
        String expected = "";
        String actual = clearDigits.clearDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testClearDigits_EmptyString() {
        ClearDigits clearDigits = new ClearDigits();
        String input = "";
        String expected = "";
        String actual = clearDigits.clearDigits(input);
        assertEquals(expected, actual);
    }
}
