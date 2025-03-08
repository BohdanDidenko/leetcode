package com.leetcode.arrays;

import java.util.Arrays;
import java.util.List;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .sorted()
                .distinct()
                .toList();
        if (list.size() < 3) {
            return list.get(list.size() -1);
        } else {
            return list.get(list.size() -3);
        }
    }
}
