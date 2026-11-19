// Problem: 219. Contains Duplicate II
// Link: https://leetcode.com/problems/contains-duplicate-ii/
// Time Complexity: O(n) | Space Complexity: O(min(n, k))

import java.util.HashSet;

/*
 * Easy explanation:
 *
 * We need to find two equal numbers whose indexes are at most k positions apart.
 * A HashSet is used as a sliding window to remember only the recent numbers.
 *
 * For every number at index i:
 * 1. If the window has become larger than k, remove the oldest number.
 * 2. Check whether the current number is already in the window.
 *    - If it is present, the same number occurred within k positions, so return true.
 * 3. Otherwise, add the current number to the window and continue.
 *
 * Example: nums = [1, 2, 3, 1], k = 3
 * - Read 1: window = [1]
 * - Read 2: window = [1, 2]
 * - Read 3: window = [1, 2, 3]
 * - Read 1: 1 is already in the window, so the answer is true.
 *
 * If no nearby duplicate is found after checking every number, return false.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Stores numbers from the last k indexes.
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove the number that is now more than k positions away.
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            // A match in the current window is a nearby duplicate.
            if (set.contains(nums[i])) {
                return true;
            }

            // Keep the current number for the next comparisons.
            set.add(nums[i]);
        }

        // No two equal numbers were found within distance k.
        return false;
    }
}
