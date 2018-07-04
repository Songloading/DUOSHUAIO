public class SumOfLeaves {
/**
 * Return the sum of left nodes.
	    3
	   / \
	  9  20
	    /  \
	   15   7
	
	There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) {
			val = val;
		}
	}

	public int sumOfLeftLeaves(TreeNode root) {

		return sumOfLeftLeaves(root, false);
	}

	public int sumOfLeftLeaves(TreeNode root, boolean c) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null && c == true)
			return root.val;
		return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
	}
/**
 *  Using a boolean to keep track of if current node is in the left tree and check if it is the very last one.
 */
}
