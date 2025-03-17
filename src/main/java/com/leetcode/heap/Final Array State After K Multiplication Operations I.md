# 3264. Final Array State After K Multiplication Operations I

## Problem Description

You are given:
- An integer array `nums`
- An integer `k`
- An integer `multiplier`

You need to perform **k operations** on the array. In each operation:
1. Find the **minimum value** `x` in `nums`. If there are multiple occurrences of the minimum value, select the **first occurrence**.
2. Replace the selected minimum value `x` with `x * multiplier`.

Return the **final state** of the array `nums` after all `k` operations.

---

## Example 1

**Input**
nums = [2, 1, 3, 5, 6] k = 5 multiplier = 2

**Output**
[8, 4, 6, 5, 6]


**Explanation**

| Operation         | Array State        |
|-------------------|--------------------|
| After operation 1 | [2, 2, 3, 5, 6]    |
| After operation 2 | [4, 2, 3, 5, 6]    |
| After operation 3 | [4, 4, 3, 5, 6]    |
| After operation 4 | [4, 4, 6, 5, 6]    |
| After operation 5 | [8, 4, 6, 5, 6]    |

---

## Example 2

**Input**
nums = [1, 2] k = 3 multiplier = 4


**Output**
[16, 8]


**Explanation**

| Operation         | Array State  |
|-------------------|--------------|
| After operation 1 | [4, 2]       |
| After operation 2 | [4, 8]       |
| After operation 3 | [16, 8]      |

---

## Constraints

- `1 <= nums.length <= 100`
- `1 <= nums[i] <= 100`
- `1 <= k <= 10`
- `1 <= multiplier <= 5`

---

## Approach

1. Iterate `k` times:
    - Find the **first occurrence** of the **minimum value** in the array.
    - Multiply that value by `multiplier` and update it in the array.
2. After `k` operations, return the final array.

Given the constraints, a straightforward implementation with linear search for the minimum is efficient enough.

---
