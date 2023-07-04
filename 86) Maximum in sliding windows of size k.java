import java.util.* ;
import java.io.*; 

import java.util.ArrayList;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        Deque<Integer> dq = new LinkedList<>();

        while (j < nums.size()) {
            while (!dq.isEmpty() && nums.get(dq.peekLast()) < nums.get(j)) {
                dq.removeLast();
            }

            dq.addLast(j);

            if (j - i + 1 < k) {
                j++;
            } else {
                ans.add(nums.get(dq.peekFirst()));
                if (nums.get(i) == nums.get(dq.peekFirst())) {
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        }

        return ans;
	}
}