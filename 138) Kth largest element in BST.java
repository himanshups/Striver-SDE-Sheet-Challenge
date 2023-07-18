import java.util.*;
import java.io.*;
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;
class Solution {
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		List<Integer> x = new ArrayList<>();
		inorder(root, x);

		int n = x.size();
		if (k > n) {
			return -1;
		}

		return x.get(n - k);
	}
	private static void inorder(TreeNode<Integer> root, List<Integer> x) {
		if (root == null) {
			return;
		}
		inorder(root.left, x);
		x.add(root.data);
		inorder(root.right, x);
	}
}