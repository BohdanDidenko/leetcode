package com.leetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FinalPricesWithSpecialDiscountTest {

    @Test
    public void testFinalPrices_Example1() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {8, 4, 6, 2, 3};
        int[] expected = {4, 2, 4, 2, 3};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinalPrices_Example2() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinalPrices_NoDiscount() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {10, 20, 30, 40, 50};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinalPrices_AllDiscount() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinalPrices_EmptyArray() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {};
        int[] expected = {};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFinalPrices_SingleElementArray() {
        FinalPricesWithSpecialDiscount solution = new FinalPricesWithSpecialDiscount();
        int[] prices = {10};
        int[] expected = {10};
        int[] actual = solution.finalPrices(prices);
        assertArrayEquals(expected, actual);
    }
}
