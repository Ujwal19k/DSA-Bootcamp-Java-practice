// 645. Set Mismatch
// https://leetcode.com/problems/set-mismatch/description/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] narr = new int[2];
        int n = nums.length;
        int i = 0;
        // index=val-1
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                narr[0] = nums[j];
                narr[1] = j + 1;
            }
        }
        return narr;
    }
}