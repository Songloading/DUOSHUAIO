public class InvertBinaryTree {
/**
 * Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode toreturn = new TreeNode(root.val);
		toreturn.right = invertTree(root.left);
		toreturn.left = invertTree(root.right);
		return toreturn;
	}
	/**
	 * Create a new root and recursively set backside of the original one.
	 */

}
