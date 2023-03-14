//1672. Richest Customer Wealth - revision
//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int bestsum=Integer.MIN_VALUE;;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>bestsum){
                bestsum=sum;

            }
        }
        return bestsum;
    }
}