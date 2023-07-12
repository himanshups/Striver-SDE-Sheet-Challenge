import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List<Integer> getPostOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        solve(root, ans);
        return ans;
    }

    public static void solve(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        solve(root.left, ans);
        solve(root.right, ans);
        ans.add(root.data);
    }
}