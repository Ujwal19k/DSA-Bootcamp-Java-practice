import java.util.Arrays;

//Second Largest Element in an Array without sorting
//https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
//https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/


class Solution {
    int print2largest(int arr[], int n) {
        if(n==0 || n==1){
            return -1;
        }
        int large = Integer.MIN_VALUE;
    	int second_large = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            large=Math.max(arr[i],large);
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
            
        }
        if(second_large==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second_large;
        }
  
    //NORMAL SOLUTION - Input is too large    
    //   if(n==0 || n==1){
    //         return -1;
    //     }
    //     else{
    //     Arrays.sort(arr);
    //     int lar=arr[n-1];
    //     int seclar=arr[n-2];
    //     return seclar;
    //     }

    }
}