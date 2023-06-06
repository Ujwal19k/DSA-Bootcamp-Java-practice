//https://takeuforward.org/data-structure/binary-search-explained/
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 10, 13, 14, 17 };
        int k = 14;

        // Binary search
        int n = arr.length - 1;
        int start = 0, end = n;
        int mid, loc = -1;
        while (start <= n - 1) {
            // Making array half everytime
            mid = (start + end) / 2;

            // checking in which part the element is present
            if (arr[mid] < k) {
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            }
            if (arr[mid] == k) {
                loc = mid;
                break;
            }
        }
        if (loc == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + k + " Found at " + loc + " index");
        }

    }
}
// Output:Element 14

// Found at 5 index

// Time complexity:O(log n)
// Space complexity : O(1)