import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		String ans = new String();
		if (n == 0)
			return ans;
		Arrays.sort(arr);
		String start = arr[0];
		String end = arr[n - 1];
		for (int i = 0; i < start.length(); i++) {
			if (start.charAt(i) == end.charAt(i))
				ans += start.charAt(i);
			else
				break;
		}
		return ans;
	}

}
