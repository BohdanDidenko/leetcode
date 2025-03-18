package com.leetcode.string;

public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] splitedData = date.split("-");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitedData.length; i++) {
            result.append(Integer.toBinaryString(Integer.parseInt(splitedData[i])));
            if (i != splitedData.length - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
