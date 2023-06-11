import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        int n = arr.size(); //size of the given array.
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>(); //declaring the map.
        map.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ arr.get(i);

            //By formula: x = xr^k:
            int p = xr ^ x;

            // add the occurrence of xr^k
            // to the count:
            if (map.containsKey(p)) {
                cnt += map.get(p);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        return cnt;
	}
}