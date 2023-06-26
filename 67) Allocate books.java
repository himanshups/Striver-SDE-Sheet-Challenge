import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPossible(long n, long m,int[] arr,long mid){
        int day = 1;
        long reqTime = 0;
        for(int i = 0; i < m; i++){ 
            if(reqTime + arr[i] <= mid){
                reqTime +=arr[i];
            }
            else{
                day++;
                if(day > n || arr[i] > mid){
                    return false;
                }
                reqTime = arr[i];              
            }
        }
         return true;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        //n here no of students ie:Code babbar concept
        //m length of array
        long s = 0, totalTime = 0, ans = -1;
        for(int i = 0; i< m; i++){
            totalTime += time[i];
        }
        long e = totalTime;        
        while(s<=e){
            long mid = s + (e - s) / 2;
            if(isPossible(n, m , time, mid)){ //the min element presence in left part
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
//             mid = s + (e - s) / 2;
        }
        return ans;
    }
}
