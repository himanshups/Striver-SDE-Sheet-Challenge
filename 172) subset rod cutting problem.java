public class Solution {
public static int cutRod(int price[], int n) {
		int l=price.length;
		int[] dp=new int[n+1];

		for(int i=l-1;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				dp[j]=Math.max(price[i-1]+dp[j-i],dp[j]);
			}
		}
		return dp[n];
	}
}