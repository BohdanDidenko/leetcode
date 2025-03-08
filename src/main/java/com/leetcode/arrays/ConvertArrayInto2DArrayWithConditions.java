package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayInto2DArrayWithConditions {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> baseList = new ArrayList<>();
        result.add(baseList);
        for (int i = 0; i < nums.length; i++) {
            if (baseList.contains(nums[i])) {
                boolean flag = true;
                for (List<Integer> list : result) {
                    if (!list.contains(nums[i])) {
                        list.add(nums[i]);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    List<Integer> additionalList = new ArrayList<>();
                    additionalList.add(nums[i]);
                    result.add(additionalList);
                }
            } else {
                baseList.add(nums[i]);
            }
        }
        return result;
    }
}
