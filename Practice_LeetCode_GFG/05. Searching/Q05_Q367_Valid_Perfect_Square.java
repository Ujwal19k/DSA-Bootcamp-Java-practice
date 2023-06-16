//367. Valid Perfect Square
//https://leetcode.com/problems/valid-perfect-square/description/
class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            long mid = (end - start) / 2 + start;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }
        }
        return false;
    }
}