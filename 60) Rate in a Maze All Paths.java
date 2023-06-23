import java.util.* ;
import java.io.*; 
public class Solution {
    
    private static final int[][] directions = new int[][] {
        {0, -1}, // LEFT
        {1, 0},  // DOWN
        {0, 1},  // RIGHT
        {-1, 0}  // UP
    };
    
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[][] visited = new int[n][n];
        visited[0][0] = 1;
        
        ratInAMazeHelper(0, 0, visited, maze, result);
        
        return result;
    }
    
    private static void ratInAMazeHelper(int row, int col, 
                                    int[][] visited, int[][] maze, 
                                    ArrayList<ArrayList<Integer>> result) {
        
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            updateResult(visited, result);
            return;
        }
        
        for (int[] direction: directions) {
            int nRow = row + direction[0];
            int nCol = col + direction[1];
            
            if (nRow >= 0 && nRow < maze.length 
                && nCol >= 0 && nCol < maze[0].length 
                && visited[nRow][nCol] != 1 && maze[nRow][nCol] == 1) {
                
                visited[nRow][nCol] = 1;
                ratInAMazeHelper(nRow, nCol, visited, maze, result);
                visited[nRow][nCol] = 0;
            }
        }
        
    }
    
    private static void updateResult(int[][] visited, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> current = new ArrayList<>();
        
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                current.add(visited[i][j]);
            }
        }
        
        result.add(current);
    }
}