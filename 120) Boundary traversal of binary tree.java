import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
    static boolean isLeaf(TreeNode node){
        return (node.left==null) && (node.right==null);
    }
    static void leftBoundary(TreeNode node,ArrayList<Integer> l){
        TreeNode cur=node.left;
        while(cur!=null){
            if(isLeaf(cur)==false) l.add(cur.data);
            if(cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }
    }
    static void rightBoundary(TreeNode node,ArrayList<Integer> l){
        TreeNode cur=node.right;
        ArrayList<Integer> t=new ArrayList <Integer>() ;
        while(cur!=null){
            if(isLeaf(cur)==false) t.add(cur.data);
            if(cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }
        int i;
        for(i=t.size()-1;i>=0;i--){
            l.add(t.get(i));
        }
    }
    static void addLeaves(TreeNode node,ArrayList<Integer> l){
        if(isLeaf(node)){
            l.add(node.data);
            return;
        }
        if(node.left!=null) addLeaves(node.left,l);
        if(node.right!=null) addLeaves(node.right,l);
    }
    
	public static ArrayList<Integer> traverseBoundary(TreeNode node){
		// Write your code here.
        ArrayList<Integer> l=new ArrayList <Integer>();
        if(isLeaf(node)==false) l.add(node.data);
        leftBoundary(node,l);
        addLeaves(node,l);
        rightBoundary(node,l);
        return l;
        
	}
}