Problem:

A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.

Leetcode Link: https://leetcode.com/problems/perfect-number/description/

Approach:

Start sum = 1 since 1 is always a proper divisor (except for 1 itself).
Iterate from 2 to sqrt(num).
If i divides num:
Add i.
Add num / i if it is different from i.
  
Solution:
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1) return false;
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(num/i != i){
                    sum+=num/i;
                }
            }
        }
        return sum==num;
    }
}

Time Complexity
O(√n)
Space Complexity
O(1)
