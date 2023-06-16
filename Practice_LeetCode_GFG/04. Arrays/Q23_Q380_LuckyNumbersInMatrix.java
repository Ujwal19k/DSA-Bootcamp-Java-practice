// 1380. Lucky Numbers in a Matrix
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        // for the min form the row
        int colc = Integer.MIN_VALUE; // for max from the col
        for (int i = 0; i < n; i++) {
            int rowc = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < rowc) {
                    rowc = matrix[i][j];
                    index = j; // deciding the column
                }
            }

            colc = rowc;
            for (int k = 0; k < n; k++) {
                colc = Math.max(colc, matrix[k][index]);
            }
            if (colc == rowc) {
                list.add(colc);
            }

        }

        return list;
    }
}