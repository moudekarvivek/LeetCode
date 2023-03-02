// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// 1431. Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> ans = new ArrayList<>(candies.length);
       int maxi = -999999;
       for(int i = 0; i < candies.length; i++){
          maxi = Math.max(maxi,candies[i]);
       }
       for(int i : candies){
           ans.add(i >= maxi - extraCandies);
       }
       return ans;
    }
}