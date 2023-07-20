public class Solution 
{
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int n=mat.length,m=mat[0].length,cnt=0;
        int vis[][] = new int[n][m];
        int dir[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && mat[i][j]==1){
                    dfs(mat,vis,dir,i,j);
                    cnt++;
                }
            }
        }return cnt;
    }
    static void dfs(int[][] mat,int[][] vis,int[][] dir,int i, int j){
        vis[i][j]=1;
        for(int child[]:dir){
            int ni=i+child[0],nj=j+child[1];
            if(ni>=0 && ni<mat.length && nj>=0 
            && nj<mat[0].length && vis[ni][nj]==0 && mat[ni][nj]==1){
                dfs(mat, vis, dir, ni, nj);
            }
        }
    }
}