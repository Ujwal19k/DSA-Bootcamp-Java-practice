// Floor in a Sorted Array
// https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%3BbatchId=154
class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n - 1;
        int ans = 0; // if the element is not found
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x && arr[mid] != x) { // imp condition
                // look for small index on left
                // ans=mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }

}
