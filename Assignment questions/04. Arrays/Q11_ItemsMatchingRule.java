import java.util.List;

// 1773. Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/description/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}

// also can use this
// for(List<String> item : items) {
// if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
// count++;
// } else if(ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
// count++;
// } else if(ruleKey.equals("name") && item.get(2).equals(ruleValue) ) {
// count++;
// }
// }