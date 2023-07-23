import java.util.*;
import java.util.*;

public class Solution {

    public static long Count(int i,int denom[],int bal,long[][] dp){

        if(i==0){

            if(bal%denom[0]==0){

                return 1;

            }else{

                return 0;

            }

        }

        if(dp[i][bal]!=-1) return dp[i][bal];

        long include=0;

        if(denom[i]<=bal){

            include=Count(i,denom,bal-denom[i],dp);

        }

        long exclude=Count(i-1,denom,bal,dp);

        dp[i][bal]=include+exclude;

        return dp[i][bal];

    }

 

    public static long countWaysToMakeChange(int denominations[], int value){

        //write your code here

        int n=denominations.length;

        //why value+1 because of 0 balance

        long dp[][]=new long[n][value+1]; 

        for(long r[]:dp){

            Arrays.fill(r,-1);

        }

        long res=Count(n-1,denominations,value,dp);

        return res;     

 

    }

    

}