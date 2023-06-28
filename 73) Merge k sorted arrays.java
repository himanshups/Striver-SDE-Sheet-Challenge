import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	static ArrayList<Integer> merge(ArrayList<Integer>start,ArrayList<Integer>end){
		int i=0,j=0;
		ArrayList<Integer>merged=new ArrayList<>();

		while(i<start.size() && j<end.size()){
			if(start.get(i)<end.get(j)){
				merged.add(start.get(i++));
			}
			else{
				merged.add(end.get(j++));
			}
		}
		while(i<start.size()){
			merged.add(start.get(i++));
		}
		while(j<end.size()){
			merged.add(end.get(j++));
		}

		return merged;
	}
	static ArrayList<Integer> mergeHelper(ArrayList<ArrayList<Integer>>arr,int start,int end){
		if(start==end){
			return arr.get(start);
		}
		int mid=start+(end-start)/2;
		ArrayList<Integer>left=mergeHelper(arr,start,mid);
		ArrayList<Integer>right=mergeHelper(arr,mid+1,end);

		return merge(left,right);
	}
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		return mergeHelper(kArrays,0,k-1);
	}
}
