import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {

		// Brute force Approch
		write your code here
		long max = Long.MIN_VALUE;
		for(int i = 0;i<n;i++){
			long sum = 0;
			for(int j = i;j<n;j++){
				sum+=arr[j];
				max = Math.max(sum,max);
			}

		}

		// Kadane's Algorithm
		long sum = 0;
		long max = Long.MIN_VALUE;
		for(int i = 0;i<n;i++){
			sum = sum + arr[i];

			if(sum>max) max = sum;

			if(sum<0) sum = 0;

		}

		if(max<0) return 0;
		return max;
	}

}
