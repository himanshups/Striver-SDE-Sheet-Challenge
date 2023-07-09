import java.util.*;
public class Solution {
    public static List<Integer> search(String s, String pattern) {
        List<Integer> matches = new ArrayList<>();
        String str = pattern + "#" + s;
        int i = 0;
        int[] z = new int[str.length()];
        while (i < str.length()) {
            while (i <= pattern.length()) {
                z[i] = 0;
                i++;
            }
            int l = 0, r = 0;
            if (str.charAt(l) == str.charAt(i)) {
                r = i;
                while (r < str.length() && str.charAt(l) == str.charAt(r)) {
                    l++;
                    r++;
                }
            }
            z[i] = l;
            i++;
        }
        for (i = 0; i < str.length(); i++) {
            if (z[i] == pattern.length()) {
                matches.add(i - pattern.length());
            }
        }
        return matches;
    }
}