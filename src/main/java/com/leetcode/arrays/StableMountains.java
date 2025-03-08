package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class StableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < height.length; i++) {
            if (i != 0 && height[i-1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }
}