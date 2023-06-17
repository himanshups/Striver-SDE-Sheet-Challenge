import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int count=0;
		if(n==0||n==1) return 1;
		for(int i=0;i<n-1;i++){
			if(arr.get(i).equals(arr.get(i+1))) continue;
			else count++;
		}
		return count+1;
	}
}