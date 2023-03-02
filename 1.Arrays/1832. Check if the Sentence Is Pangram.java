// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// 1832. Check if the Sentence Is Pangram
class Solution {
    public boolean checkIfPangram(String sentence) {
     boolean[] arr = new boolean[26]; //by default this array contains false as element
     for(int i = 0; i < sentence.length(); i++){
         arr[sentence.charAt(i) - 97] = true;
     } 
        for(int i = 0; i < 26; i++){
            if(arr[i] == false){
             return false;
             } 
        }
        return true;  
  }
}