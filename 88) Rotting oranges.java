import java.util.*;
public class Solution {
	public static int minTimeToRot(int[][] grid, int n, int m) {
        Queue<Pair> q=new LinkedList<>();
         boolean[][] visit=new boolean[n][m];
        int countfresh=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            // Adding oranges that are rotten
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    // Counting number of fresh oranges
                }else if(grid[i][j]==1){
                    countfresh++;
                }
            }
        }
        int tm=0,count=0;
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int row=curr.row;
            int col=curr.col;
            int t=curr.time;
            tm=Math.max(tm,t);
            for(int i=0;i<4;i++){
                int newRow=row+dx[i];
                int newCol=col+dy[i];
                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && grid[newRow][newCol]==1 && !visit[newRow][newCol]){
                    visit[newRow][newCol]=true;
                    q.offer(new Pair(newRow,newCol,t+1));
                    count++;
                }
            }
        }
        // if the total count is not equal to countfresh it means 
        // some oranges are still left that are fresh so return -1
        return count!=countfresh?-1:tm;
	}
}
class Pair{
    int row,col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}