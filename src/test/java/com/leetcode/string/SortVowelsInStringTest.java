package com.leetcode.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortVowelsInStringTest {

    @Test
    public void testSortVowelsInString() {
        SortVowelsInString solution = new SortVowelsInString();
        String s = "hoaqeiu";
        String expected = "haeqiou";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortVowelsInString_NoVowels() {
        SortVowelsInString solution = new SortVowelsInString();
        String s = "bcd";
        String expected = "bcd";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortVowelsInString_OnlyVowels() {
        SortVowelsInString solution = new SortVowelsInString();
        String s = "aeiou";
        String expected = "aeiou";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortVowelsInString_EmptyString() {
        SortVowelsInString solution = new SortVowelsInString();
        String s = "";
        String expected = "";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortVowelsInString_SingleCharacter() {
        SortVowelsInString solution = new SortVowelsInString();
        String s = "a";
        String expected = "a";
        String actual = solution.sortVowels(s);
        assertEquals(expected, actual);
    }
}
