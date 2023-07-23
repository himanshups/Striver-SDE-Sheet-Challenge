import java.util.*;
import java.io.*;

/*************************************************************
 * 
 * Following is the Binary Tree node structure
 * 
 * class BinaryTreeNode < Integer > {
 * int data;
 * BinaryTreeNode < Integer > left;
 * BinaryTreeNode < Integer > right;
 * 
 * public BinaryTreeNode(int data) {
 * this.data = data;
 * }
 * }
 * 
 *************************************************************/
public class Solution {

public static void changeTree(BinaryTreeNode < Integer > root) {

// System.out.println();

traverse(root, 0);

}




private static int traverse(BinaryTreeNode < Integer > root, int parentSum) {

if(root == null) return 0;

int val = root.data;

// System.out.println("root.data = " + root.data);

root.data += parentSum;

// System.out.println("root.data after parent sum = " + root.data);




int leftSum = traverse(root.left, root.data);

int rightSum = traverse(root.right, root.data);




int sum = leftSum + rightSum; // it will definitely come for base nodes.

root.data = sum == 0 ? root.data : sum;




// System.out.println("root.data back at " + val + " = " + root.data);




return root.data;

}

}