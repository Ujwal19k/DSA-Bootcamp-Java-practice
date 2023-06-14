//might be wrong
public class IMP_Lower_and_Upper_bound {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 5;
        int lb = lowerb(arr, x);
        int ub = upperb(arr, x);
        System.out.println("Lower Bound index is: " + lb);
        System.out.println("Upper Bound index is: " + ub);
    }

    private static int lowerb(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x <= arr[mid]) {
                ans = mid;
                // look for more small index in left
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // return high;
        return ans;
    }

    private static int upperb(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x >= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

/*
 * The terms "upper bound" and "lower bound" are slightly different concepts.
 * The lower bound refers to the index of the first occurrence of the target
 * value in the
 * array, if it is present. If the target value is not present, the lower bound
 * refers to
 * the index where the target value should be inserted to maintain the sorted
 * order of the
 * array.
 * 
 * The upper bound, on the other hand, refers to the index of the last
 * occurrence of the target
 * value in the array, if it is present. If the target value is not present, the
 * upper bound refers
 * to the index where the target value should be inserted to maintain the sorted
 * order of the
 * array.
 */