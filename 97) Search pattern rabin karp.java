import java.util.*;

public class Solution {
    private static final int d = 256;
    private static final int q = 101;

    public static List<Integer> stringMatch(String txt, String pat) {
        List<Integer> res = new ArrayList<>();

        if (pat.length() > txt.length()) {
            return res;
        }

        int i, j;
        int p = 0; // Hash value for pattern
        int t = 0; // Hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < pat.length() - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate the hash value of pattern and first window of text
        for (i = 0; i < pat.length(); i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= txt.length() - pat.length(); i++) {
            // Check the hash values of current window of text and pattern
            // If the hash values match, then only check for characters one by one
            if (p == t) {
                // Check for characters one by one
                for (j = 0; j < pat.length(); j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }

                // If p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == pat.length()) {
                    res.add(i + 1);
                }
            }

            // Calculate hash value for the next window of text
            // Remove leading digit, add trailing digit
            if (i < txt.length() - pat.length()) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + pat.length())) % q;

                // We might get negative values of t, converting it to positive
                if (t < 0) {
                    t = t + q;
                }
            }
        }

        return res;
    }
}