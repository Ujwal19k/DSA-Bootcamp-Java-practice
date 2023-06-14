//169. Majority Element
//https://leetcode.com/problems/majority-element/
//https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/
package A2Z_Striver_Array_Playlist;

import java.util.HashMap;
import java.util.Map;

public class A2ZMajority_Element {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // We are storing the numbers as the keys and their freq as value

        // storing elements with its freq
        for (int i = 0; i < n; i++) {
            // checking if the element is present or not, if not present then giving it a
            // default value
            int value = map.getOrDefault(nums[i], 0);
            // if a value is already present then incrementing it
            map.put(nums[i], value + 1);
        }
        // the map is ready

        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            if (a.getValue() > (n / 2)) {
                return a.getKey();
            }
        }
        return -1;

        /*
         * Time Complexity: O(N*logN) + O(N), where N = size of the given array.
         * Reason: We are using a map data structure. Insertion in the map takes logN
         * time.
         * And we are doing it for N elements. So, it results in the first term
         * O(N*logN).
         * The second O(N) is for checking which element occurs more than floor(N/2)
         * times.
         * If we use unordered_map instead, the first term will be O(N) for the best and
         * average
         * case and for the worst case, it will be O(N2).
         */
    }
}
