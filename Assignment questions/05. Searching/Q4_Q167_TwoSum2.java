// /167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] nar = new int[2];

        while (i < j) {
            int add = numbers[i] + numbers[j];
            if (add == target) {
                nar[0] = i + 1;
                nar[1] = j + 1;
                break;
            } else if (add > target) {
                j--;
            } else {
                i++;
            }
        }
        return nar;
    }

    // int[] nar = new int[2];
    // for(int i=0;i<numbers.length;i++){
    // for(int j=i+1;j<numbers.length;j++){
    // if(numbers[i]+numbers[j]==target){
    // nar[0]=i+1;
    // nar[1]=j+1;
    // }
    // }
    // }return nar;
    // }
}