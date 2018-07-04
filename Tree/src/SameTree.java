public class SameTree {
	/**
	 * Returns if two trees are exactly same
	 */
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) {
			val = val;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p.val != q.val)
			return false;
		return ((isSameTree(p.right, q.right)) && (isSameTree(p.left, q.left)));
	}
/**
 * Basic checks, nothing serious here.
 */
}
