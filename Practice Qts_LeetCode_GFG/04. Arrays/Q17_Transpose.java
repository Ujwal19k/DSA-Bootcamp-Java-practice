// 867. Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/description/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rl = matrix[0].length;
        int[][] newm = new int[rl][matrix.length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < rl; c++) {
                newm[c][r] = matrix[r][c];
            }
        }
        return newm;

    }
}