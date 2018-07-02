import java.util.ArrayList;
import java.util.HashMap;

public class TrimaBinarySearchTree {
	/**
	 * Given an upper and lower bound, trim the tree based on the bounds Input:
	 * Input: 
	    3
	   / \
	  0   4
	   \
	    2
	   /
	  1
	
	  L = 1
	  R = 3
	
	Output: 
	      3
	     / 
	   2   
	  /
	 1
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		if (root.val == L) {
			root.left = null;
			root.right = trimBST(root.right, L, R);
		}
		if (root.val == R) {
			root.right = null;
			root.left = trimBST(root.left, L, R);
		}
		if (root.val < L) {
			return trimBST(root.right, L, R);
		}
		if (root.val > R) {
			return trimBST(root.left, L, R);
		}
		if (root.val < R && root.val > L) {
			root.right = trimBST(root.right, L, R);
			root.left = trimBST(root.left, L, R);
		}
		
		return root;
	}
/**
 *  Three cases behind it, needed to be found out.
 *  1 Problem: Why cant set root to trimBST(root.right/left, L, R) in case that val is out of bound.
 */

}
