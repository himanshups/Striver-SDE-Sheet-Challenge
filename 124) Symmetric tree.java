/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        return root1.data.equals(root2.data)
            && isSymmetric(root1.left, root2.right)
            && isSymmetric(root1.right, root2.left);
    }
}