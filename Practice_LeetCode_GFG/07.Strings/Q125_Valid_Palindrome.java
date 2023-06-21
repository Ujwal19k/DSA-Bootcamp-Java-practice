// /125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int st = 0;
        int en = s.length() - 1;
        while (st <= en) {
            char fst = s.charAt(st); // stores ascii
            char lst = s.charAt(en);
            if (!Character.isLetterOrDigit(lst)) {
                en--;
            } else if (!Character.isLetterOrDigit(fst)) {
                st++;
            } else {
                if (Character.toLowerCase(fst) != Character.toLowerCase(lst)) {
                    return false;
                }
                st++;
                en--;

            }

        }
        return true;
    }
}