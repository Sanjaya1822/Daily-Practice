Problem : 
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Leetcode Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/

Approach :
Create a Min Heap (PriorityQueue in Java).
Traverse every element in the array.
Insert the current element into the heap.
If the heap size becomes greater than k, remove the smallest element (poll()).
After processing all elements, the heap contains the k largest elements.
The smallest element among these k elements (the heap's top) is the kth largest element.
Return pq.peek().
  
Solution : 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k) pq.poll();
        } 
        return pq.peek();
    }
}

Time Complexity: O(n log k)

Space Complexity: O(k)
