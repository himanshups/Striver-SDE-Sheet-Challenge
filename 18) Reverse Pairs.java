import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int count = 0;
        int n = arr.size();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr.get(i)>2* arr.get(j)) count++;
            }
        }
        return count;
    }
}