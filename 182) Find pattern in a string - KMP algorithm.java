import java.util.* ;
import java.io.*; 
public class Solution {
    static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int i = 0;
        int j = 1;

        while (j < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                i++;
                lps[j] = i;
                j++;
            } else {
                if (i != 0) {
                    i = lps[i - 1];
                } else {
                    lps[j] = 0;
                    j++;
                }
            }
        }

        return lps;
    }

    static boolean findPattern(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        int[] lps = buildLPS(pattern);

        int i = 0;
        int j = 0;

        while (j < n) {
            if (pattern.charAt(i) == text.charAt(j)) {
                i++;
                j++;
            }

            if (i == m) {
                return true;
            } else if (j < n && pattern.charAt(i) != text.charAt(j)) {
                if (i != 0) {
                    i = lps[i - 1];
                } else {
                    j++;
                }
            }
        }

        return false;
    }
}