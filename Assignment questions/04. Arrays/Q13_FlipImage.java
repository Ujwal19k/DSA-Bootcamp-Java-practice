// 832. Flipping an Image
//https://leetcode.com/problems/flipping-an-image/description/


public class Q13_FlipImage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},
                          {1,0,1},
                          {1,0,0}};
        flipAndInvertImage(image);
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;  
        int[][] flip=new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                flip[i][j]=image[i][col-j-1];      //if length of row is 3 then col-j-1 is 3-0-1=2 
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(flip[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                flip[i][j]=flip[i][j]==1?0:1;
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(flip[i][j]+" ");
            }
            System.out.println();
        }
        
        //System.out.println(flip);
        return null;
    }

}





/*
 * Leetcode
 * class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //we have to make a new 2d array to store the data so we initialised new array flip
        //but while initialising we need to mention no. of rows and col
        int row=image.length;
        int col=image[0].length;    //length of column 1
        int[][] flip=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                flip[i][j]=image[i][col-j-1];   //if length of row is 3 then col-j-1 is 3-0-1=2 

            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                flip[i][j]=flip[i][j]==1?0:1;
            }
        }
        return flip;
    }
}
 */
