public class IMP_Dummy {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 6;
        int lb = lowerb(arr, x, true);
        int ub = upperb(arr, x, false);
        System.out.println("Lower Bound index is: " + lb);
        System.out.println("Upper Bound index is: " + ub);
    }

    private static int lowerb(int[] arr, int x, boolean b) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {

            }
        }
        return 0;
    }

}
