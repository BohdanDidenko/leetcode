package com.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWordsContainingCharacterTest {

    @Test
    public void testFindWordsContainingCharacter_Example1() {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {"apple", "banana", "cherry"};
        char x = 'a';
        List<Integer> expected = List.of(0, 1);
        List<Integer> actual = solution.findWordsContaining(words, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsContainingCharacter_Example2() {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {"hello", "world", "java"};
        char x = 'o';
        List<Integer> expected = List.of(0, 1);
        List<Integer> actual = solution.findWordsContaining(words, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsContainingCharacter_NoMatchingWords() {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {"apple", "banana", "cherry"};
        char x = 'z';
        List<Integer> expected = List.of();
        List<Integer> actual = solution.findWordsContaining(words, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsContainingCharacter_EmptyArray() {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {};
        char x = 'a';
        List<Integer> expected = List.of();
        List<Integer> actual = solution.findWordsContaining(words, x);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsContainingCharacter_SingleElementArray() {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {"apple"};
        char x = 'a';
        List<Integer> expected = List.of(0);
        List<Integer> actual = solution.findWordsContaining(words, x);
        assertEquals(expected, actual);
    }
}
