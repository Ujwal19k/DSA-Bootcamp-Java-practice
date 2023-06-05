// 989. Add to Array-Form of Integer
// /https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.LinkedList;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> listt = new LinkedList<Integer>();
        int n = num.length - 1;
        while (n >= 0 || k != 0) {
            if (n >= 0) {
                k += num[n];
                n--;
            }
            listt.addFirst(k % 10);
            k /= 10;
        }
        return listt;
    }
}