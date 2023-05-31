//Move all zeroes to end of array
//GFG- https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
//https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/

public class A2Z_Shift_Zeros {
    public static void main(String[] args) {
        int[] arr = { 5, 11 };
        shift(arr);
    }

    // using i for iteration and j for pointing zeros
    private static void shift(int[] arr) {
        int l = arr.length;
        int j = -1;

        // finding first occurence of 0
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // if still j=-1 then there is no zero in array
        if (j != -1) {
            for (int i = j + 1; i < l; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
