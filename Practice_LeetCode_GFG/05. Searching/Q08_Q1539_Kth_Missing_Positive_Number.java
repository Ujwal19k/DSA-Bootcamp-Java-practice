// 1539. Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/description/
//https://youtu.be/iWT1cH6LXLc
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int st = 0;
        int end = arr.length;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] - (mid + 1) < k) {
                st = mid + 1;
            } else {
                end = mid;
            }

        }
        return st + k;
    }
}

// int ap=0; //array pointer
// int num=1;
// int p=0;
// while(p<k){
// if(arr[0]==num){
// ap++;
// num++;
// }else{
// num++;
// //k--;
// p++;
// }
// }
// return num;
