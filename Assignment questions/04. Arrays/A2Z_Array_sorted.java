//1752. Check if Array Is Sorted and Rotated
//GFG: https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
//LeetCode: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/solutions/3025376/easiest-java-solution-beat-100-beginner-freindly/

GFG:
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
           
        }
        return true;
    }
}


LeetCode:
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                c++;
            }
        }
        if(c>1){
            return false;
        }
        return true;
        
    }
}
