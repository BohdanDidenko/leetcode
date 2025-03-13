package com.leetcode.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomStackTest {

    @Test
    public void testCustomStack_PushAndPop() {
        CustomStack solution = new CustomStack(5);
        solution.push(1);
        solution.push(2);
        solution.push(3);
        assertEquals(3, solution.pop());
        assertEquals(2, solution.pop());
        assertEquals(1, solution.pop());
    }

    @Test
    public void testCustomStack_IncrementFullStack() {
        CustomStack solution = new CustomStack(5);
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.push(5);
        solution.increment(5, 100);
        assertEquals(105, solution.pop());
        assertEquals(104, solution.pop());
        assertEquals(103, solution.pop());
        assertEquals(102, solution.pop());
        assertEquals(101, solution.pop());
    }
}
