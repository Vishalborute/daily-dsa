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
| 2567 | [Minimum Score by Changing Two Elements](https://leetcode.com/problems/minimum-score-by-changing-two-elements/) | Arrays / Sorting | Medium | [Java](arrays/2567.%20Minimum%20Score%20by%20Changing%20Two%20Elements.java) |

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

## Solution Explanation: Minimum Score by Changing Two Elements

After sorting the array, the smallest value is at the beginning and the largest value is at the end. Because we can change two elements, only three useful choices need to be checked:

1. Change the two smallest elements. The remaining range is `nums[n - 1] - nums[2]`.
2. Change the smallest and largest elements. The remaining range is `nums[n - 2] - nums[1]`.
3. Change the two largest elements. The remaining range is `nums[n - 3] - nums[0]`.

The answer is the smallest result among these three choices.

For example, with `nums = [1, 4, 7, 8, 5]`, sorting gives `[1, 4, 5, 7, 8]`:

- Change the two smallest: `8 - 5 = 3`
- Change the smallest and largest: `7 - 4 = 3`
- Change the two largest: `5 - 1 = 4`

The minimum possible score is therefore `3`.

- Time complexity: `O(n log n)` because the array is sorted.
- Space complexity: `O(log n)` for Java's primitive-array sorting stack usage.

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
