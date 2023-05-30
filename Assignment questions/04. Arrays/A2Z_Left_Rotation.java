
//Rotating an Array
//YUF - https://takeuforward.org/data-structure/rotate-array-by-k-elements/
//GFG- https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1
import java.util.Scanner;

public class A2Z_Left_Rotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int shift = 7;
        shiftArr(arr, shift);
    }

    private static void shiftArr(int[] arr, int shift) {

        int l = arr.length;
        shift = shift % l;
        int[] temp = new int[shift];

        for (int j = 0; j < shift; j++) {
            temp[j] = arr[j]; // stored initial numbers in a seperate array
        }

        for (int i = shift; i < l; i++) {
            arr[i - shift] = arr[i]; // shifting numbers to left
        }

        for (int i = l - shift; i < l; i++) {
            arr[i] = temp[i - (l - shift)]; // inserting the numbers in vacant place
                                            // l-shift= the vacant space obtained after the number is shifted to left
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
