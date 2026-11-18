# Daily DSA Practice

This repository contains my Data Structures and Algorithms solutions in Java.

## Goals

- Solve DSA problems consistently
- Improve problem-solving and coding skills
- Learn optimized approaches
- Prepare for technical interviews

## Progress

| # | Problem | Topic | Difficulty | Solution |
|---|---|---|---|---|
| 219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | Arrays / Hashing | Easy | [Java](arrays/ContainsDuplicateII.java) |

## Solution Explanation: Contains Duplicate II

The goal is to find two equal numbers whose indexes differ by at most `k`.

The solution uses a `HashSet` as a sliding window. The set stores only the numbers seen in the last `k` positions:

1. Move through the array from left to right.
2. Remove the oldest number when it becomes more than `k` positions away.
3. If the current number is already in the set, a nearby duplicate exists, so return `true`.
4. Otherwise, add the current number and continue.
5. Return `false` if the entire array is checked without finding a match.

For `nums = [1, 2, 3, 1]` and `k = 3`, the final `1` is already in the sliding window. Its index is only three positions away from the first `1`, so the result is `true`.

- Time complexity: `O(n)` because each number is added and removed at most once.
- Space complexity: `O(min(n, k))` because the set keeps at most `k` recent numbers.

## Repository Structure

Solutions are grouped by their main DSA topic. Each solution includes the problem link and its time and space complexity.

```text
daily-dsa/
|-- arrays/
|-- strings/
|-- linked-list/
|-- stack-and-queue/
|-- trees/
|-- graphs/
|-- binary-search/
`-- dynamic-programming/
```

## Language

- Java

## Profile

- [GitHub](https://github.com/Vishalborute)
