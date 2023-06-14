// 1886. Determine Whether Matrix Can Be Obtained By Rotation
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // rotaion of matrix = Transpose + Interchange columns/rows of that Transpose
        int n = mat.length;
        int r90 = 0, r180 = 0, r270 = 0, r360 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == target[j][n - 1 - i])
                    r90++;
                if (mat[i][j] == target[n - 1 - i][n - 1 - j])
                    r180++;// here rows will exchange
                if (mat[i][j] == target[n - 1 - j][i])
                    r270++;
                if (mat[i][j] == target[i][j])
                    r360++;
            }
        }
        if (r90 == n * n || r180 == n * n || r270 == n * n || r360 == n * n)
            return true;
        else
            return false;
    }
}