//485. Max Consecutive Ones
//LC- https://leetcode.com/problems/max-consecutive-ones/description/
//TUF- https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array/
package A2Z_Striver_Array_Playlist;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0, cnt = 0;
        if (nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}

// Time Complexity: O(N) since the solution involves only a single pass.
// Space Complexity: O(1) because no extra space is used.