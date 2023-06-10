// 1. Two Sum
// /https://leetcode.com/problems/two-sum/description/
// GFG
// -https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] newarray=new int[2];
        // ArrayList<Integer> arry=new ArrayList<Integer>();
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
                j++;
            }
            // for(int j=i+1;j<n;j++){
            // if(nums[i]+nums[j]==target){
            // return new int[]{i,j};
            // }
            // }
        }
        return new int[] {};
    }
}