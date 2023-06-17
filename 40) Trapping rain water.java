import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] height, int n) {
        long res=0;
        long lmax[]=new long[n];
        long rmax[]=new long[n];
        lmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(height[i],lmax[i-1]);
        }
        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }
        for(int i=1;i<n-1;i++)
        {
             res=res+(Math.min(lmax[i],rmax[i])-height[i]);
        }
        return res;
    }
}

