Problem:
Baseball Game

Leetcode Link:
https://leetcode.com/problems/baseball-game/description/

Solution :
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<operations.length;i++){
            String ch= operations[i];
            if(ch.equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(ch.equals("D")){
                int x= arr.get(arr.size()-1)*2;
                arr.add(x);
            }
            else if(ch.equals("+")){
                int x= arr.get(arr.size()-1) + arr.get(arr.size()-2);
                arr.add(x);
            }else {
                arr.add(Integer.valueOf(ch));
            }
        }   
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        return sum;
    }
}
