//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/description/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] narr = new int[2*n];
        int j=0;  //j is used for sequential selection of the index in the nums
        for(int i=0;i<nums.length;i+=2){
            narr[i]=nums[j++]; //for index 0,2,4
        }
        for(int i=1;i<nums.length;i+=2){
            narr[i]=nums[j++];
         }
        return narr;
    }
}