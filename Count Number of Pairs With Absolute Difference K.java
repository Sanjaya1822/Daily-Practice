Problem : Count Number of Pairs With Absolute Difference K

Leetcode link : https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
Question :
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.

Approach:
Traverse the array using two nested loops to generate every unique pair (i, j) where i < j.
For each pair, calculate the absolute difference using Math.abs(nums[i] - nums[j]).
If the difference equals k, increment the count.
After checking all pairs, return the final count.

Solution:
  class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (Math.abs(nums[i] - nums[j]) == k) {
                    c++;
                }
            }
        }

        return c;
    }
}

Time Complexity: O(n²)
Space Complexity: O(1)
