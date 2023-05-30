// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        // i is used to store the unique numbers
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++; // to store next unique number
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}