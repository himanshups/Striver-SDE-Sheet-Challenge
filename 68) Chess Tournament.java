import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean f(int[] positions, int n, int c, int dis){
        int count = 1;
        int last = positions[0];
        for(int i=1;i<n;i++){
            if(positions[i]-last >= dis){
                count++;
                last = positions[i];
            }
        }
        if(count >= c)return true;
        return false;
    }
    public static int chessTournament(int[] positions, int n,  int c) 
	{
        Arrays.sort(positions);
        int low = 1;
        int res = -1;
        int high = positions[n-1]-positions[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(f(positions,n,c,mid)){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
}