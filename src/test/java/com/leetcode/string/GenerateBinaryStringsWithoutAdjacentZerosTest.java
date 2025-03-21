package com.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateBinaryStringsWithoutAdjacentZerosTest {

    @Test
    public void testValidStrings() {
        GenerateBinaryStringsWithoutAdjacentZeros solution = new GenerateBinaryStringsWithoutAdjacentZeros();
        int n = 2;
        List<String> expected = List.of("01", "10", "11");
        List<String> actual = solution.validStrings(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidStrings_N1() {
        GenerateBinaryStringsWithoutAdjacentZeros solution = new GenerateBinaryStringsWithoutAdjacentZeros();
        int n = 1;
        List<String> expected = List.of("0", "1");
        List<String> actual = solution.validStrings(n);
        assertEquals(expected, actual);
    }
}