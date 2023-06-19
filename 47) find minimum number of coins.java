import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
    int a[] = {1000 , 500 , 100 , 50, 20 , 10 , 5 , 2 , 1};
    int c = 0;
    int i = 0;
    while(i < a.length){
        if(amount >= a[i]){
            c += amount/a[i];
            int temp = amount/a[i];
            amount -= temp * a[i];
        }
        i++;
    }
    return c;
    }
