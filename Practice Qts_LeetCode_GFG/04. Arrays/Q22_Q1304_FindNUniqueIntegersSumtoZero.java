//1304. Find N Unique Integers Sum up to Zero
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 1) {
            // odd
            arr[n - 1] = 0;
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }

        } else {
            for (int i = 0; i < n; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
        }
        return arr;
    }
}