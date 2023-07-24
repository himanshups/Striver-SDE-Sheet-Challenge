import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

       int n = arr.size();
      for(int i = 0;i<n;i++)
       {
           int j = 0;
           ArrayList<Integer> ele = new ArrayList<>();
           ele.add(arr.get(i));
           ans.add(ele);
           int size = ans.size();

           while(j<size-1)
          {
              ArrayList<Integer> one = ans.get(j);
              ArrayList<Integer> two = new ArrayList<Integer>(one);
              two.add(arr.get(i));
              ans.add(two);
              j++;
          }

         
       }

          ans.add(new ArrayList<Integer>());
          return ans;
	}
}
