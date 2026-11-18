// Problem: 219. Contains Duplicate II
// Link: https://leetcode.com/problems/contains-duplicate-ii/
// Time Complexity: O(n) | Space Complexity: O(min(n, k))

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}