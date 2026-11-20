// Problem: 1. Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Time Complexity: O(n) | Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexByValue.containsKey(complement)) {
                return new int[] { indexByValue.get(complement), i };
            }
            indexByValue.put(nums[i], i);
        }

        throw new IllegalArgumentException("No pair sums to the target");
    }
}
