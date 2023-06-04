import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row[]=new int[n]; //row array
        int cols[]=new int[m]; //cols array

        //traverse the matrix

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    // setting ith row to 1
                    row[i]=1;
                    //setting jth cols to 1
                    cols[j]=1;
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(row[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
        
        
    

}