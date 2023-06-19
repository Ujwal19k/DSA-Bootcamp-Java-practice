//448. Find All Numbers Disappeared in an Array
//Google
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // index=value-1
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1; // taking the index
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }
        return list;
    }
}