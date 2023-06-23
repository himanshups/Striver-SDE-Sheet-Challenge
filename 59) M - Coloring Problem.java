import java.util.* ;
import java.io.*; 
public class Solution {

    public static boolean isPossibleMthColor(int[][] mat, int[] nodeColorVector, int nodeToColored, int color, int n) {
        for (int i = 0; i < n; i++) {
            if (mat[nodeToColored][i] == 1 && nodeColorVector[i] == color) {
                return false;
            }
        }

        nodeColorVector[nodeToColored] = color;
        return true;
    }

    public static boolean solveGraph(int nodeToColored, int n, int m, int[] nodeColorVector, int[][] mat) {
        if (nodeToColored == n) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (isPossibleMthColor(mat, nodeColorVector, nodeToColored, i, n)) {
                if (solveGraph(nodeToColored + 1, n, m, nodeColorVector, mat)) {
                    return true;
                }

                nodeColorVector[nodeToColored] = 0;
            }
        }

        return false;
    }

    public static String graphColoring(int[][] mat, int m) {
        // Write your code here
        int n = mat.length;
        int[] nodeColorVector = new int[n];
        Arrays.fill(nodeColorVector, 0);

        if (solveGraph(0, n, m, nodeColorVector, mat)) {
            return "YES";
        }

        return "NO";
    }
}