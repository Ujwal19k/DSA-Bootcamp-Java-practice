// https://practice.geeksforgeeks.org/problems/rotation4723/1
// https://www.youtube.com/watch?v=jtSiWTPLwd0
class Solution {
    int findKRotation(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        int minVal = Integer.MAX_VALUE;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] < arr[end]) {
                // minVal=Math.min(minVal,arr[start]);
                if (arr[start] < minVal) {
                    minVal = arr[start];
                    index = start;
                }
                break;
            }

            if (arr[start] <= arr[mid]) {
                // minVal=Math.min(minVal,arr[start]);
                if (arr[start] < minVal) {
                    minVal = arr[start];
                    index = start;
                }
                start = mid + 1;
            } else {
                end = end - 1;
                // minVal=Math.min(minVal,arr[mid]);
                if (arr[mid] < minVal) {
                    minVal = arr[mid];
                    index = mid;
                }

            }
        }
        return index;

    }
}