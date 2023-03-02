// https://leetcode.com/problems/create-target-array-in-the-given-order/
// 1389. Create Target Array in the Given Order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
     int n = nums.length;
    List<Integer> arr = new ArrayList<>();
     int[] target = new int[n];
     for(int i = 0; i < n; i++){
        arr.add(index[i],nums[i]);
     }  
     for(int i = 0; i < n; i++){
         target[i] = arr.get(i);
     }
     return target; 
    }

}