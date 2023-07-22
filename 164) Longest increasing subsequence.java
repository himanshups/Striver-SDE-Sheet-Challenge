import java.util.*;
public class Solution {
 public static int longestIncreasingSubsequence(int arr[]){

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

    ans.add(arr[0]);

    int len = 1;

    for(int i = 1; i < n; i++)

    {

       if(ans.get(len-1) < arr[i])

       {

           ans.add(arr[i]);

           len++;

       }

       else

       {

           int ind = Collections.binarySearch(ans,arr[i]);

           // it returns the index where value is present or

           // the -index - 1 where the value could have been present

           if(ind < 0)

           {

               int realInd = (ind+1)*(-1);

               if( realInd > (len-1)  )

               {

                   ans.add(arr[i]);

                   len++;

               }

               else

               {

                   ans.set(realInd , arr[i]);

               }

            }

       }

    }

    return len;

    }

}