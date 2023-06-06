//https://takeuforward.org/data-structure/binary-search-explained/
public class BinarySearch {

    public static int binarySearch(int[] arr, int start, int end, int k) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (k == arr[mid]) {
            return mid;
        } else if (k < arr[mid]) {
            return binarySearch(arr, start, mid - 1, k);
        } else {
            return binarySearch(arr, mid + 1, end, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 10, 13, 14, 17 };
        int k = 14;

        int start = 0;
        int end = arr.length - 1;

        int loc = binarySearch(arr, start, end, k);

        if (loc == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + k + " Found at " + loc + " index");
        }

    }
}
// Output:

// Element 14

// Found at 5 index

// Time complexity:O(log n)
// Space complexity: O(logn) for auxiliary space