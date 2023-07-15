import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {


  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    if(root == null)
    {
        return ans;
    }
    queue.offer(root);
    while(!queue.isEmpty()){
        int lev = queue.size();
        for(int i = 0 ; i < lev ; i++)
        {
            if(queue.peek().left != null)
            {
                queue.offer(queue.peek().left);
            }if(queue.peek().right != null)
            {
                queue.offer(queue.peek().right);
            }


            ans.add(queue.poll().val);
        }
    }


    return ans;
  }


}