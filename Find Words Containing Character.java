Problem : Find Words Containing Character
You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

Leetcode Link: https://leetcode.com/problems/find-words-containing-character/

Approach :
Traverse each word in the given words array.
Use indexOf(x) to check whether the character x exists in the current word.
If the character is found, add the word's index to the result list.
Return the list containing all indices of words that include the given character.


Solution:
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li=new ArrayList<>();
        for( int i=0;i<words.length;i++){
            if(words[i].indexOf(x) !=-1){
                li.add(i);
            }
        }
        return li;
    }
}
Time Complexity: O(n × m)
(n = number of words, m = average length of a word)

Space Complexity: O(k)
(k = number of matching indices stored in the result list)
