// https://leetcode.com/problems/find-the-highest-altitude/
// 1732. Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int maxi = 0;
        for(int i = 0; i < gain.length; i++){
            current += gain[i];    
            maxi = Math.max(current,maxi);
        }
        return maxi;
    }
}