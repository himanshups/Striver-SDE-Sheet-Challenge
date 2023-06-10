import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] nums, int target, int n) {
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            for(int j =i+1;j<n-2;j++){
                long t = (long)target-(long)nums[i]-(long)nums[j];
                int k = j+1;
                int l = n-1;
                while(k<l){
                long val = (long)nums[k]+(long)nums[l];
                if(val<t)k++;
                else if(val>t)l--;
                else{
                    return "Yes";
                }
            }
            }
        }
        return "No";  
  }
}