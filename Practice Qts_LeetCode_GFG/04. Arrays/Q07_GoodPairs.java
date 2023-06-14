// /1512. Number of Good Pairs
//https://leetcode.com/problems/number-of-good-pairs/description/


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int j=0;
        for(int i=0; i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){     //-1 because i should iterate till second last element because the last element will be covered by j
                //for every iteration i there should be another iteration starting from i+ in the same array
                if(nums[i]==nums[j]){
                count++;
                    
            }
            }
        }
        return count;
        
    }
}

