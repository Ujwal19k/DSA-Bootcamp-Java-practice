// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// https://takeuforward.org/data-structure/minimum-in-rotated-sorted-array/
//https://www.youtube.com/watch?v=nhEMDKMB44g

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int minVal = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] < nums[end]) {
                minVal = Math.min(minVal, nums[start]);
                break;
            }

            // checking if the left part ot the right part is sorted
            // and using the property of a sorted array (left most will be the minimum)
            // now storing this min in a variable and comparing with thr right sub array

            if (nums[start] <= nums[mid]) {
                minVal = Math.min(minVal, nums[start]);
                start = mid + 1;
            } else {
                minVal = Math.min(minVal, nums[mid]);
                end = mid - 1;
            }
        }
        return minVal;

    }
}