import java.util.* ;
import java.io.*; 
/************************************************************

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

************************************************************/

import java.util.ArrayList;


public class Solution 
{
    public static void leftView(TreeNode<Integer> root,ArrayList<Integer>ans ,int level){
        if(root==null) return;
        if(level==ans.size()){
            ans.add(root.data);
        }
            leftView(root.left,ans,level+1);
            leftView(root.right,ans,level+1);
            
        
    }
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer>ans = new ArrayList<>();
        leftView(root,ans,0);
        return ans;
    }
}
