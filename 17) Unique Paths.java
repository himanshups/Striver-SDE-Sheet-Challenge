import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int n, int m) {
		// Write your code here.
		int N = n+m-2;
		int r = n-1;
		double res = 1;
		for(int i = 1;i<=r;i++)
			res = res*(N-r+i)/i;
		return (int)res;
	}
}