package com.leetcode.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertDateToBinaryTest {

    @Test
    public void testConvertDateToBinary_Example1() {
        ConvertDateToBinary solution = new ConvertDateToBinary();
        String date = "2022-01-01";
        String expected = "11111100110-1-1";
        String actual = solution.convertDateToBinary(date);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertDateToBinary_Example2() {
        ConvertDateToBinary solution = new ConvertDateToBinary();
        String date = "1999-12-31";
        String expected = "11111001111-1100-11111";
        String actual = solution.convertDateToBinary(date);
        assertEquals(expected, actual);
    }
}
