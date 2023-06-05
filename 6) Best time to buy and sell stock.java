import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int max_profit = 0;
        for(int i = 1;i<prices.size();i++){
            int cost = prices.get(i)-min;
            max_profit = Math.max(cost,max_profit);
            min = Math.min(prices.get(i),min);
        }
        return max_profit;
    }
}