package com.kunal;

// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {

    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        // Approach 1 - Cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]; // this will store the number which will ber used as index to swap with correct
                                   // number
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;

        // Approach 2 - By using Sum
        // int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}