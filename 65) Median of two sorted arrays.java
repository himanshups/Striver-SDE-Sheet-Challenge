import java.util.*;
public class Solution {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
    ArrayList<Integer> arr = new ArrayList<>();
    double dig = 0 ;
    int l1 = a.length;
    int l2 = b.length;
    for( int i = 0 ; i < l1 ; i++ )
    {
        arr.add(a[i]);
    }
    for(int j = 0 ; j < l2 ; j++)
    {
        arr.add(b[j]);
    }
    Collections.sort(arr);
    int len = arr.size();
    if(len % 2 == 0)
    {
        dig = arr.get(len/2) + arr.get(len/2 -1);
        return dig/2;
    }
    
    return arr.get(len/2);
    }
}