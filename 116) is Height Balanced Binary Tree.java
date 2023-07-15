import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {
    static int maxDepth(BinaryTreeNode<Integer> root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        if(left == -1) return -1;
        int right = maxDepth(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		return maxDepth(root) != -1;
	}
}
