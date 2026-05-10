Problem : Cells with Odd Values in a Matrix

Leetcode Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

Solution:
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int x=0;x<n;x++){
                arr[indices[i][0]][x]+=1;
            }
            for(int y=0;y<m;y++){
                arr[y][indices[i][1]]+=1;
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0) c++;
            }
        }
        return c;
    }
}
