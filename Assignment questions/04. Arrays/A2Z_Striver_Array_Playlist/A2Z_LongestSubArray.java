package A2Z_Striver_Array_Playlist;

public class A2Z_LongestSubArray {
    public static void main(String[] args) {
        int[] A = { -1, 2, 3 };
        int k = 6;
        int length = longestSA(A, k);
        System.out.println(length);
    }

    private static int longestSA(int[] A, int k) {
        int n = A.length;
        int sum = 0, len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1); // j-i+1 is the length between i and j
                }
            }
        }
        return len;
    }

}
