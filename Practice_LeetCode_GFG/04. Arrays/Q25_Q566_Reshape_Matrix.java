// 566. Reshape the Matrix
// /https://leetcode.com/problems/reshape-the-matrix/description/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] newmat = new int[r][c];
        if ((r * c) != (m * n)) {
            return mat;
        } else {
            int row = 0;
            int col = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    newmat[row][col] = mat[i][j];
                    col++;
                    if (col == c) {
                        col = 0;
                        row++;
                    }
                }
            }
        }
        return newmat;

    }
}