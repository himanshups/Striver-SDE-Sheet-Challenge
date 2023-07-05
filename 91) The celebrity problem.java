import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findCelebrity(int n) {
        // Write your code here.
		int ans = 0;
		for(int i = 1;i<n;i++){
			if(Runner.knows(ans,i))
				ans=i;
		}
		for(int i = 0;i<n;i++){
			if(ans!=i){
				if(Runner.knows(ans,i)|| !Runner.knows(i,ans))
					return -1;
			}
		}
		return ans;
    }
}