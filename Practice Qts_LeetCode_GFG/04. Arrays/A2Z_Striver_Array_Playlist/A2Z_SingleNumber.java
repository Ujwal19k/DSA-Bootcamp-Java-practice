//136. Single Number
//LC- https://leetcode.com/problems/single-number/description/

package A2Z_Striver_Array_Playlist;

// Brute
//XOR image: https://assets.leetcode.com/users/xxdouhua/image_1554869704.png
//XOR image 2: https://assets.leetcode.com/users/xxdouhua/image_1554869741.png
class Solution {
    public int singleNumber(int[] nums) {
        // int num=0, count=0,finaln=0;
        // for(int i=0;i<nums.length;i++){
        //     num=nums[i];
        //     count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==num){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         finaln=nums[i];
        //     }
        // }
        // return finaln;
    }
}

//Excellent Code
int ans = 0;
for(int i =0; i<nums.length; i++){
    ans = ans^nums[i];
}
return ans;
