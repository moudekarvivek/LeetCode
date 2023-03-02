// https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxim = -99999;
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                 sum += accounts[row][col]; 
            }
            maxim = Math.max(maxim,sum);
        }
        return maxim;
    }
}