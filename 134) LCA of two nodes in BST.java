import java.util.*;
import java.io.*;
/*

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

*/

public class Solution {

    public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> P, TreeNode<Integer> Q) {
        if (root == null) {
            return null;
        }
        int cur = root.data;
        if (cur < P.data && cur < Q.data) {
            return LCAinaBST(root.right, P, Q);
        } else if (cur > P.data && cur > Q.data) {
            return LCAinaBST(root.left, P, Q);
        } else {
            return root;
        }
    }
}