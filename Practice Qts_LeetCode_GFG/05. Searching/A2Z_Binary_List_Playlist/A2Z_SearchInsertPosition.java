// 35. Search Insert Position
// LC- https://leetcode.com/problems/search-insert-position/description/
// GFG-
// https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1
class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int mid;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            }
        }
        return st;
    }
}