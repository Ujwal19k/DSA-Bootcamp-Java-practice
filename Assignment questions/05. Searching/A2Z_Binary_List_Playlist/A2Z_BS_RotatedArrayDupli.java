// 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
// https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1
// https://www.youtube.com/watch?v=w2G2W8l__pc
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }

            // if have duplicates. therefore trim the array size
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }

            // if have to check if the left side or the right side of the mid is sorted
            if (nums[start] <= nums[mid]) { // means that the left side from the mid is sorted
                // now check if target is between this range and if not, then search right side
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}