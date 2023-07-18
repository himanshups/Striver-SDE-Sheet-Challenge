import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode curr = root;

        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            arr.add(curr.data);
            curr = curr.right;
        }

        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int sum = arr.get(lo) + arr.get(hi);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                lo++;
            } else {
                hi--;
            }
        }

        return false;

	}
}

