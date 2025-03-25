package com.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyHashSetTest {

    @Test
    public void testAddAndGet() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        assertTrue(myHashSet.contains(1));
    }

    @Test
    public void testAddAndGetMultiple() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        assertTrue(myHashSet.contains(1));
        assertTrue(myHashSet.contains(2));
        assertTrue(myHashSet.contains(3));
    }

    @Test
    public void testAddAndGetDuplicate() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        assertTrue(myHashSet.contains(1));
    }

    @Test
    public void testRemoveAndGet() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.remove(1);
        assertFalse(myHashSet.contains(1));
    }

    @Test
    public void testRemoveAndGetMultiple() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.remove(2);
        assertTrue(myHashSet.contains(1));
        assertFalse(myHashSet.contains(2));
        assertTrue(myHashSet.contains(3));
    }

    @Test
    public void testRemoveAndGetNonExistent() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.remove(1);
        assertFalse(myHashSet.contains(1));
    }

    @Test
    public void testContainsNonExistent() {
        MyHashSet myHashSet = new MyHashSet();
        assertFalse(myHashSet.contains(1));
    }

    @Test
    public void testAddAndGetLargeValue() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1000);
        assertTrue(myHashSet.contains(1000));
    }
}
