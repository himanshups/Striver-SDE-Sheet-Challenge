import java.util.*;
import java.io.*; 
public class Solution {
 public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);
	    // Write your code here.
		java.util.HashSet<ArrayList<Integer>>map=new java.util.HashSet<>();
		for(int i=0;i<n;i++)
		{
			int left=i+1;
			int right=n-1;
			int sum=K-arr[i];
			while(left<right)
			{
				if((arr[left]+arr[right])==sum)
				{
				    ArrayList<Integer>one=new ArrayList<>();
					one.add(arr[i]);
					one.add(arr[left]);
					one.add(arr[right]);
					map.add(one);
					left++;
				}
				else if((arr[left]+arr[right])<sum)
				{
					left++;
				}
				else if((arr[left]+arr[right])>sum)
				{
					right--;
				}
			}
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ans.addAll(map);
		return ans;
	}
}
