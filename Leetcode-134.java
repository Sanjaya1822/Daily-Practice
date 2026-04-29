Problem - Gas Station
Link - https://leetcode.com/problems/gas-station/description/

Solution:
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int total=0;
      int start=0;
      int rem=0;

      for(int i=0;i<gas.length;i++){
         total+= gas[i]-cost[i];
         rem+=gas[i]-cost[i];
         if(rem<0){
            start=i+1;
            rem=0;
         }
      }
      if(total>=0) return start;
      return -1;
    }
}
