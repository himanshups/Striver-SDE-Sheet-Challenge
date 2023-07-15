import java.util.* ;
import java.io.*; 
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		Stack<BinaryTreeNode<Integer>> s1=new Stack<>();
        Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(s2.isEmpty()){
            while(!s1.isEmpty()){
                BinaryTreeNode<Integer> temp=s1.pop();
                if(temp.left!=null){
                s2.push(temp.left);
                }
                if(temp.right!=null){
                s2.push(temp.right);
                }
                list.add(temp.data);
                
            }
            }
            else{
            while(!s2.isEmpty()){
               BinaryTreeNode<Integer> temp=s2.pop();
                if(temp.right!=null){
                s1.push(temp.right);
                }
                if(temp.left!=null){
                s1.push(temp.left);
                }
                
                list.add(temp.data); 
            }
            }
        }
return list;
	}
}
