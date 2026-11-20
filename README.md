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
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays / Hashing | Easy | [Java](arrays/1.%20Two%20Sum.java) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Stack | Easy | [Java](stack-and-queue/20.%20Valid%20Parentheses.java) |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Binary Search | Medium | [Java](binary-search/33.%20Search%20in%20Rotated%20Sorted%20Array.java) |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Strings / Two Pointers | Easy | [Java](strings/125.%20Valid%20Palindrome.java) |
| 219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | Arrays / Hashing | Easy | [Java](arrays/ContainsDuplicateII.java) |
| 2567 | [Minimum Score by Changing Two Elements](https://leetcode.com/problems/minimum-score-by-changing-two-elements/) | Arrays / Sorting | Medium | [Java](arrays/2567.%20Minimum%20Score%20by%20Changing%20Two%20Elements.java) |

## Solution Explanation: Two Sum

For each number, compute the complement needed to reach the target. A hash map stores the values already seen and their indexes. If the complement is present, return its stored index and the current index; otherwise, store the current value. Looking up and inserting each value takes constant average time.

- Time complexity: `O(n)` because the array is scanned once.
- Space complexity: `O(n)` for the map.

## Solution Explanation: Valid Parentheses

Use a stack to track unmatched opening brackets. Push each opening bracket. For a closing bracket, fail if the stack is empty or its top is not the matching opening bracket; otherwise, pop it. The string is valid only if the stack is empty after processing every character.

- Time complexity: `O(n)` because each character is processed once.
- Space complexity: `O(n)` for the stack in the worst case.

## Solution Explanation: Valid Palindrome

Compare characters from the two ends, skipping any character that is not a letter or digit. Compare the remaining characters without regard to case, then move both pointers inward. If all pairs match, the string is a palindrome under the problem's rules.

- Time complexity: `O(n)` because the pointers traverse the string at most once.
- Space complexity: `O(1)` because only two indexes are used.

## Solution Explanation: Search in Rotated Sorted Array

At each binary-search step, at least one half of the rotated array is sorted. Check which half is sorted, then determine whether the target lies within that half. Keep only the half that can contain the target; return its index when found or `-1` when the range is empty.

- Time complexity: `O(log n)` because the search range is halved each iteration.
- Space complexity: `O(1)` because the search uses only a fixed number of variables.

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
