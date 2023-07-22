import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        int omax = Integer.MIN_VALUE;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            Integer max = null;
            for (int j = 0; j < i; j++) {
                if (rack.get(j) < rack.get(i)) {
                    if (max == null) {
                        max = dp[j];
                    } else if (dp[j] > max) {
                        max = dp[j];
                    }
                }
            }
            if (max == null) {
                dp[i] = rack.get(i);
            } else {
                dp[i] = max + rack.get(i);
            }
            omax = Math.max(omax, dp[i]);
        }
        return omax;
    }
}
