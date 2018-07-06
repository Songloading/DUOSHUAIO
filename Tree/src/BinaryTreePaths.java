import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
/** #257
 * Given a binary tree, return all root-to-leaf paths.

		Note: A leaf is a node with no children.
		
		Example:
		
		Input:
		
		   1
		 /   \
		2     3
		 \
		  5
		
		Output: ["1->2->5", "1->3"]
		Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
		if (root == null)
			return new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		traverse(root, "", list);
		return list;

	}

	public void traverse(TreeNode root, String s, List<String> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list.add(s + root.val);
			return;
		}
		String t = s + root.val + "->";
		traverse(root.left, t, list);
		traverse(root.right, t, list);
	}
/**
 *  Recursively traverse all the paths and if we find a leaf, then we add it.
 */
}
