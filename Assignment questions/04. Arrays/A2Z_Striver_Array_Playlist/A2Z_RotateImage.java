package A2Z_Striver_Array_Playlist;
// 48. Rotate Image

// https://leetcode.com/problems/rotate-image/description/
// TUF-https://takeuforward.org/data-structure/rotate-image-by-90-degree/
//Anticlock wise- https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1

class Solution {
    public void rotate(int[][] matrix) {
        // if we were allowed to take another 2d matrix then we could have used
        // newmatrix[i][j]=matrix[j][n-1-i];
        // but here we are not allowed so we are first Transposing the matrix and then
        // swaping/reversing

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // j=i because it will overwrite
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                // using n/2 because we dont want to do swapping twice
                // eg for 3*3 matrix, we only have to swap col0 with col2
                // and for 4*4 matrix we have to swap col0<->col3 & col1<->col2
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        // For anti clockwise rotation
        /*
         * for (int i = 0; i < n/2; i++) {
         * for (int j = 0; j < (n); j++) {
         * //here rows will be trimmend
         * int temp = 0;
         * temp = matrix[i][j];
         * matrix[i][j] = matrix[n-1-i][j];
         * matrix[n-1-i][j] = temp;
         * }
         * }
         */
    }
}