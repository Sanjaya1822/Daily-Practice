Problem : 
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.
Leetcode link : https://leetcode.com/problems/largest-number/description/

Approach :
Convert all numbers into strings.
Sort the strings using a custom rule:
For two strings a and b, compare a + b and b + a.
If b + a is larger, place b before a; otherwise, place a before b.
If the first element after sorting is "0", return "0" because all numbers are zero.
Join all the strings together and return the result.
  
Solution:
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr , (a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

Time Complexity
Converting integers to strings: O(n)
Sorting: O(n log n)
Building the final string: O(n)

Overall Time Complexity: O(n log n)

Space Complexity: O(n) (for the string array and output).
