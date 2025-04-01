package com.leetcode.matrix;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuckyNumbersInMatrixTest {

    @Test
    public void testLuckyNumbers_SimpleCase() {
        LuckyNumbersInMatrix solution = new LuckyNumbersInMatrix();
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        List<Integer> expected = new ArrayList<>();
        expected.add(15);
        assertEquals(expected, solution.luckyNumbers(matrix));
    }

    @Test
    public void testLuckyNumbers_MultipleLuckyNumbers() {
        LuckyNumbersInMatrix solution = new LuckyNumbersInMatrix();
        int[][] matrix = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };
        List<Integer> expected = new ArrayList<>();
        expected.add(12);
        assertEquals(expected, solution.luckyNumbers(matrix));
    }

    @Test
    public void testLuckyNumbers_SingleColumn() {
        LuckyNumbersInMatrix solution = new LuckyNumbersInMatrix();
        int[][] matrix = {
                {1},
                {2},
                {3}
        };
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        assertEquals(expected, solution.luckyNumbers(matrix));
    }
}