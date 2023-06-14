// 540. Single Element in a Sorted Array
// LC-
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// GFG-
// https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
// YT-https://www.youtube.com/watch?v=AZOmHuHadxQ

class Solution {
    public int singleNonDuplicate(int[] nums) {
        // 0 1 2 3 4 5 6 7 8 9 10
        // 1 1 2 2 3 3 4 5 5 6 6
        // |

        // we can observe that the left subarray to 4 have this pattern:
        // (2,2)->index:(2,3)->(even,odd)
        // therefor the element is on the right side

        // the right subarray to 4 have this patter: (5,5)->index:(7,8)->(odd,even)
        // therefore the element is on the left side

        // a number will be said to be single if its left and right neighbour are
        // different

        int n = nums.length;

        // firstly writing all the edge cases
        if (n == 1)
            return nums[0];

        // we dont want the overflow condition
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int start = 1;
        int end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // a number will be said to be single if its left and right neighbour are
            // different
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // to check if mid is in left of element
            // 0 1 2 3 4 5 6 7 8 9 10
            // 1 1 2 2 3 3 4 5 5 6 6
            // |

            // eg: we are at index 3
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {// we are on right
                end = mid - 1;
            }
        }
        return -1;
    }
}