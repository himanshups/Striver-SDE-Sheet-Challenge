import java.util.ArrayList;

import java.util.*;




public class Solution {

    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {

        // Write your code here.

        int[]prev = new int [w+1];

        for(int i = weights.get(0) ; i <=w ; i++ )prev[i] = values.get(0);




        for(int index = 1 ; index < n ; index++ ){

            for(int wt= w ; wt>=0 ; wt--){

                    int notTake = prev[wt];

                    int take = Integer.MIN_VALUE;

                    if(weights.get(index)<=wt)take = values.get(index)+prev[wt-weights.get(index)];

                    prev[wt] = Math.max(notTake,take);

            }

        }




        return prev[w];

        // for(int[]r:dp){

        //  Arrays.fill(r,-1);

        // }

        //return helper(n-1, w, values, weights,dp);

    }

    public static int helper(int index,int wt , ArrayList<Integer>values,ArrayList<Integer> wts,int[][]dp){

        

            if(index==0){

                if(wts.get(index)<=wt)return values.get(index);

                return 0;

            }

            if(dp[index][wt]!=-1)return dp[index][wt];

            int notTake = helper(index-1,wt,values,wts,dp);

            int take = Integer.MIN_VALUE;

            if(wts.get(index)<=wt)take = values.get(index)+helper(index-1,wt-wts.get(index),values,wts,dp);

            return dp[index][wt] = Math.max(notTake,take);

    }

}