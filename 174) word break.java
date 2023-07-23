import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean wordBreak(String[] arr, int n, String target) {
        int i = 0;
        while(i < n){
            if(target.contains(arr[i])){
                target = target.replace(arr[i], "");
                i = 0;
            }
            else{
                i++;
            }
        }
        return target.isEmpty();
    }
}