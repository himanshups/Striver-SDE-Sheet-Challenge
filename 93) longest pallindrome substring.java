public class Solution {
	public static String longestPalinSubstring(String str) {
		// Write your code here.
		int n = str.length();
		int left, right;
		String longest = "";

		for (int i = 0; i < n; i++) {
			left = i;
			right = i;

			while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
				left--;
				right++;
			}

			if (right - left - 1 > longest.length()) {
				longest = str.substring(left + 1, right);
			}
		}

		for (int i = 0; i < n - 1; i++) {
			left = i;
			right = i + 1;

			while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
				left--;
				right++;
			}

			if (right - left - 1 > longest.length()) {
				longest = str.substring(left + 1, right);
			}
		}

		return longest;
	}
}
