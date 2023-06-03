
//A2Z- https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
//GFG- https://practice.geeksforgeeks.org/problems/missing-number4257/1
//LC- https://leetcode.com/problems/missing-number/description/
package A2Z_Striver_Array_Playlist;

public class A2Z_MissingNumber {
    public static void main(String[] args) {
        int[] A = { 1, 4, 3, 2 };
        int size = 5;
        int ans = findNumber(A, size);
        System.out.println(ans);
    }

    private static int findNumber(int[] A, int size) {
        int sum = 0, Asum = 0;
        // for (int i = 1; i <= size; i++) {
        // sum = sum + i;
        // }

        sum = (size * (size + 1)) / 2;

        for (int i = 0; i < A.length; i++) {
            Asum = Asum + A[i];
        }

        return sum - Asum;

    }
}

/*
 * Most Optimal
 * import java.util.*;
 * 
 * public class tUf {
 * public static int missingNumber(int []a, int N) {
 * 
 * int xor1 = 0, xor2 = 0;
 * 
 * for (int i = 0; i < N - 1; i++) {
 * xor2 = xor2 ^ a[i]; // XOR of array elements
 * xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
 * }
 * xor1 = xor1 ^ N; //XOR up to [1...N]
 * 
 * return (xor1 ^ xor2); // the missing number
 * }
 * 
 * public static void main(String args[]) {
 * int N = 5;
 * int a[] = {1, 2, 4, 5};
 * 
 * int ans = missingNumber(a, N);
 * System.out.println("The missing number is: " + ans);
 * }
 * }
 */
