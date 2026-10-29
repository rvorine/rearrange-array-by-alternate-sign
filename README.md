[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Rearrange Array Elements by Sign (LeetCode 2149)

## Problem

`nums` has an **equal number** of positive and negative integers. Rearrange it so that:
- every consecutive pair has **opposite signs**,
- the **relative order** of positives (and of negatives) is preserved,
- the result **starts with a positive** integer.

Example:

```
Input:  [3, 1, -2, -5, 2, -4]     Output: [3, -2, 1, -5, 2, -4]
Input:  [-1, 1]                   Output: [1, -1]
Input:  [1, 2, -1, -2]            Output: [1, -1, 2, -2]
```

## Solution

Two write indexes into a result array, filled in **one pass**.

- Positives always land on **even** indexes: start `pos = 0`, step by 2.
- Negatives always land on **odd** indexes: start `neg = 1`, step by 2.

Read `nums` left to right and drop each value into its slot. Because each sign advances through its own slots in order, relative order is preserved, and because counts are equal, both sets of slots fill exactly.

A simpler way is to split into two lists and merge them — this does the same in one pass without the extra lists.

**Time:** O(n) — one pass.
**Space:** O(n) — the output array (O(1) extra).

## Implementations

| Language | File |
|---|---|
| Python | [`python/rearrange_by_sign.py`](python/rearrange_by_sign.py) |
| Java | [`java/RearrangeBySign.java`](java/RearrangeBySign.java) |
| Kotlin | [`kotlin/RearrangeBySign.kt`](kotlin/RearrangeBySign.kt) |
| JavaScript | [`javascript/rearrangeBySign.js`](javascript/rearrangeBySign.js) |
| C# | [`csharp/RearrangeBySign.cs`](csharp/RearrangeBySign.cs) |
