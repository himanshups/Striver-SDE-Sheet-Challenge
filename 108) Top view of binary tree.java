import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

class Pair{
	BinaryTreeNode node;
	int index;
	Pair(BinaryTreeNode node, int index){
		this.node = node;
		this.index = index;
	}
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		Map<Integer, Integer> map = new TreeMap<>();
		ArrayList<Integer> list = new ArrayList<>();

		if(root == null) return list;

		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(root, 0));

		while(!q.isEmpty()){
			Pair curr = q.poll();
			BinaryTreeNode node = curr.node;
			int index = curr.index;

			if(!map.containsKey(index)) map.put(index, node.val);

			if(node.left != null) q.offer(new Pair(node.left, index - 1));
			if(node.right != null) q.offer(new Pair(node.right, index + 1));
		}

		for(int e: map.values()){
			list.add(e);
		}

		return list;
	}
}