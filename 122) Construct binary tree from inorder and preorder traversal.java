import java.util.Vector;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    public static TreeNode<Integer> buildBinaryTree(Vector<Integer> inorder, Vector<Integer> preorder) {
        int n = inorder.size();
        int preIndex = 0;
        return solve(inorder, preorder, n, preIndex, 0, n - 1);
    }

    private static TreeNode<Integer> solve(Vector<Integer> inorder, Vector<Integer> preorder, int n, int preIndex, int inorderStart, int inorderEnd) {
        if (preIndex >= n || inorderStart > inorderEnd) {
            return null;
        }

        int element = preorder[preIndex++];
        TreeNode<Integer> root = new TreeNode<>(element);
        int position = findPosition(inorder, element, inorderStart, inorderEnd);

        root.left = solve(inorder, preorder, n, preIndex, inorderStart, position - 1);
        root.right = solve(inorder, preorder, n, preIndex, position + 1, inorderEnd);

        return root;
    }