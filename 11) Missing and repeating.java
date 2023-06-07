import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[]hash = new int[n+1];
        for(int i = 0;i<n;i++){
            hash[arr.get(i)]++;
        }
        // find the repeating and missing number
        int repeating = -1,missing=-1;
        for(int i = 1;i<=n;i++){
            if(hash[i]==2 ) repeating = i;
            else if(hash[i]==0) missing = i;
            if(repeating!=-1 && missing!=-1) break;
        }
        return new int[] {missing,repeating};
    } 
}