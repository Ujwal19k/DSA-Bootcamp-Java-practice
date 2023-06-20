// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
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
            if (nums[j] != (j + 1)) {
                list.add(nums[j]);
            }
        }
        return list;

        // using HashMap
        /*
         * ArrayList<Integer> al=new ArrayList<>();
         * HashMap<Integer,Integer> map=new HashMap<>();
         * if(nums.length==1){
         * return al;
         * }
         * for(int i=0;i<nums.length;i++) {
         * map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         * }
         * for(int i:map.keySet()) {
         * if(map.get(i)>1) {
         * al.add(i);
         * }
         * }
         * Collections.sort(al);
         * return al;
         */
    }
}