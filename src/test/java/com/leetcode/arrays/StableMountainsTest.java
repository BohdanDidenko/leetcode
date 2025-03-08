package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StableMountainsTest {

    @Test
    public void testStableMountains_Example1() {
        StableMountains solution = new StableMountains();
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        List<Integer> actual = solution.stableMountains(height, threshold);
        assertEquals(expected, actual);
    }

    @Test
    public void testStableMountains_Example2() {
        StableMountains solution = new StableMountains();
        int[] height = {10, 1, 10, 1, 10};
        int threshold = 3;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        List<Integer> actual = solution.stableMountains(height, threshold);
        assertEquals(expected, actual);
    }

    @Test
    public void testStableMountains_Example3() {
        StableMountains solution = new StableMountains();
        int[] height = {10, 1, 10, 1, 10};
        int threshold = 10;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.stableMountains(height, threshold);
        assertEquals(expected, actual);
    }

    @Test
    public void testStableMountains_EmptyArray() {
        StableMountains solution = new StableMountains();
        int[] height = {};
        int threshold = 2;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.stableMountains(height, threshold);
        assertEquals(expected, actual);
    }

    @Test
    public void testStableMountains_SingleElementArray() {
        StableMountains solution = new StableMountains();
        int[] height = {5};
        int threshold = 2;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.stableMountains(height, threshold);
        assertEquals(expected, actual);
    }
}