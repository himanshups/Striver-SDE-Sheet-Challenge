import java.util.*;
import java.io.*;
/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/

public class Solution {
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		BinaryTreeNode<Integer> temp = root;
		while (temp != null) {
			if (temp.data == x) {
				return true;
			} else if (temp.data > x) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return false;
	}
}