import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long count=0;
        // Write your code here.
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }
}