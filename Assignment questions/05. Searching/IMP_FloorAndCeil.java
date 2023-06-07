public class IMP_FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 21, 25, 50 };
        int x = 26;

        int floor = FindFloor(arr, x);
        System.out.println("Floor is: " + floor);
        int ceil = FindCeil(arr, x);
        System.out.println("Ceil is: " + ceil);
    }

    private static int FindCeil(int[] arr, int x) {
        int st = 0;
        int end = arr.length - 1;

        // initialize ceil to -1
        int ceil = -1;

        while (st < end) {
            // find the mid-value in the search space
            int mid = (st + end) / 2;

            // if `x` is equal to the middle element, it is the ceil
            if (arr[mid] == x) {
                return arr[mid];
            }

            // if `x` is less than the middle element, the ceil exists in the
            // subarray nums[left…mid]; update ceil to the middle element
            // and reduce our search space to the left subarray nums[left…mid-1]
            else if (x < arr[mid]) {
                ceil = arr[mid];
                end = mid - 1;
            }

            // if `x` is more than the middle element, the ceil exists in the
            // right subarray nums[mid+1…right]
            else {
                st = mid + 1;
            }
        }
        return ceil;
    }

    private static int FindFloor(int[] arr, int x) {

        int st = 0;
        int end = arr.length - 1;

        // initialize floor to -1
        int floor = -1;

        // loop till the search space is exhausted
        while (st <= end) {
            int mid = st + (end - st) / 2;

            // if `x` is equal to the middle element, it is the floor
            if (arr[mid] == x) {
                return arr[mid];
            }

            // if `x` is less than the middle element, the floor exists in the left subarray
            else if (x < arr[mid]) {
                end = mid - 1;
            }

            // if `x` is more than the middle element, the floor exists in the right
            // subarray
            // update floor to the middle element and reduce our search space to the right
            // subarray nums[mid+1…right]
            else {
                floor = arr[mid];
                st = mid + 1;
            }
        }
        return floor;
    }
}
