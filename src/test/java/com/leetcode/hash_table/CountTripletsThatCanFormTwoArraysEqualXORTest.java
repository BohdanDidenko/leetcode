package com.leetcode.hash_table;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTripletsThatCanFormTwoArraysEqualXORTest {

    @Test
    public void testCountTriplets_Example1() {
        CountTripletsThatCanFormTwoArraysEqualXOR solution = new CountTripletsThatCanFormTwoArraysEqualXOR();
        int[] arr = {2, 3, 1, 6, 7};
        int expected = 4;
        int actual = solution.countTriplets(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountTriplets_Example2() {
        CountTripletsThatCanFormTwoArraysEqualXOR solution = new CountTripletsThatCanFormTwoArraysEqualXOR();
        int[] arr = {1, 1, 1, 1, 1};
        int expected = 10;
        int actual = solution.countTriplets(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountTriplets_EmptyArray() {
        CountTripletsThatCanFormTwoArraysEqualXOR solution = new CountTripletsThatCanFormTwoArraysEqualXOR();
        int[] arr = {};
        int expected = 0;
        int actual = solution.countTriplets(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountTriplets_SingleElementArray() {
        CountTripletsThatCanFormTwoArraysEqualXOR solution = new CountTripletsThatCanFormTwoArraysEqualXOR();
        int[] arr = {1};
        int expected = 0;
        int actual = solution.countTriplets(arr);
        assertEquals(expected, actual);
    }
}