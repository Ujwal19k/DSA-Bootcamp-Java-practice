// 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/description/
\
class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) return mat[0][0];
        int sum=0;
        int rl=mat[0].length;
        for(int r=0;r<mat.length;r++){
            for(int c=0;c<rl;c++){
                if(r==c){
                    sum=sum+mat[r][c];
                }
                if(c==(rl-(r+1)) && r!=c){
                    sum=sum+mat[r][c];
                }
            }
        }
        return sum;
        
    }
}