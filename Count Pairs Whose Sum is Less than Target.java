Problem :  Count Pairs Whose Sum is Less than Target
  Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

Leetcode Link : https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
Approach :
Use two nested loops to generate every unique pair of elements in the list.
For each pair, calculate the sum of the two numbers.
If the sum is less than the given target, increment the pair count.
After checking all possible pairs, return the total count.

Solution:
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j) < target) c++;
            }
        }
        return c;
    }
}

Time Complexity: O(n²)
Space Complexity: O(1)
