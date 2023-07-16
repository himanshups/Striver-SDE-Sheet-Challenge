import java.util.* ;
import java.io.*; public class Solution {
    public static int minSumPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j] = 0;

                if(i == 0 && j == 0){
                    dp[i][j] = grid[i][j];
                    continue;
                } 
                else{
                    int left = grid[i][j], up = grid[i][j];
                    if(i > 0) up += dp[i-1][j];
                    else up += (int)1e9;

                    if(j > 0) left += dp[i][j-1];
                    else left += (int)1e9;
                    dp[i][j] = Math.min(left,up);
                }
            }
        }

        return dp[n-1][m-1];
    }
}