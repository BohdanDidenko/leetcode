package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            boolean isValid = true;
            for (int j = 0; j < binaryString.length() - 1; j++) {
                if (binaryString.charAt(j) == '0' && binaryString.charAt(j + 1) == '0') {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                result.add(binaryString);
            }
        }
        return result;
    }
}
