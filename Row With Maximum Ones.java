Problem : 
Row With Maximum Ones
Leetcode link : https://leetcode.com/problems/row-with-maximum-ones/description/
Question :
Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.
Approach :
Traverse each row of the matrix and count the number of 1s in that row.
Compare the current row's count with the maximum count found so far.
If the current count is greater, update the maximum count and store the current row index.
After processing all rows, return the array containing the row index and the maximum number of 1s.


  Solutiion:
  class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) {
                    c++;
                }
            }
            if(arr[1]<c){
                arr[1]=c;
                arr[0]=i;
            }
        }
        return arr;
    }
}
Time Complexity: O(m × n)
Space Complexity: O(1)
(where m = number of rows and n = number of columns)
