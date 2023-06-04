import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
		public static ArrayList<Long> generate(int row){

		ArrayList<Long> templist = new ArrayList<>();
		long ans = 1;
		templist.add(ans); // storing 1 in pascal triangle

		// calculate rest of pascal triangle
		for(long col = 1;col <row;col++){
			ans = ans*(row-col);
			ans = ans/col;
			templist.add(ans);
		}



		return templist;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> result = new ArrayList<>();
		
		//storing pascal triangle
		for(int row = 1;row<=n;row++){
			result.add(generate(row));
		}
		return result;
				 
	}
}
