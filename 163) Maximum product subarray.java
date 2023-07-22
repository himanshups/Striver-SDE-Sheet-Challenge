import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		int prod1 = arr.get(0),prod2 = arr.get(0),result = arr.get(0);
        for(int i = 1 ; i < n ; i++ ){
        int temp = Math.max(arr.get(i),Math.max(prod1*arr.get(i),prod2*arr.get(i)));
       prod2 = Math.min(arr.get(i),Math.min(prod1*arr.get(i),prod2*arr.get(i)));
            prod1 = temp;
            result = Math.max(result,prod1);
        }

        return result;
	}
}