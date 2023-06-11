// Count pairs with given sum
// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
//https://www.geeksforgeeks.org/count-pairs-with-given-sum/

import java.util.HashMap;

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (map.containsKey(k - arr[i])) { // eg 6-1=5 Therefor search 5 in hashmap
                count += map.get(k - arr[i]); // count=count+(number of time 5 appears)
            }

            // check if the number is available
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        return count;
    }
}