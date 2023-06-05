import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        // 1) Brute force Approach - Sort array - O(nlogn)
        Arrays.sort(arr);

        // Better Approach - using counting sort - O(2n)
        int zero = 0,one = 0,two = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0) zero++;
            else if (arr[i]==1)one++;
            else two++;
        }
        
        for(int i = 0;i<zero;i++) arr[i]=0;
        for(int i = zero;i<zero+one;i++) arr[i]=1;
        for(int i = zero+one; i<n;i++) arr[i]=2;

        // optimal Approach 
        int low = 0,mid = 0,high = n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0: {
                    int temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp = arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
                }

            }
        }

    }
} 