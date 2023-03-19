//1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<Integer>(); // we will have to use arraylist coz the number should not overwrite
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);      //add(position,number)
        }
        for(int i=0;i<arr.size();i++){
            target[i]=arr.get(i);
        }
        return target;
    }
}
