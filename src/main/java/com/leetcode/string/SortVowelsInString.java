package com.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SortVowelsInString {
    public String sortVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> currentVowels = new ArrayList<>();
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (vowels.contains(input[i])) {
                currentVowels.add(input[i]);
            }
        }

        if (currentVowels.isEmpty()) {
            return s;
        }

        Collections.sort(currentVowels);
        StringBuilder t = new StringBuilder();
        for (int i = 0, j = 0; i < input.length; i++) {
            if (vowels.contains(input[i])) {
                t.append(currentVowels.get(j));
                j++;
            } else {
                t.append(input[i]);
            }
        }

        return t.toString();
    }
}
