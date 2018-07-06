import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	/**#107
	 * Given a binary tree, return the bottom-up level order traversal of its
	 * nodes' values. (ie, from left to right, level by level from leaf to
	 * root).
	 * Given binary tree [3,9,20,null,null,15,7],
		    3
		   / \
		  9  20
		    /  \
		   15   7
		return its bottom-up level order traversal as:
		[
		  [15,7],
		  [9,20],
		  [3]
		]
	*/
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null)
			return list;
		levelOrderBottom(root, 0, list);
		for (int i = 0; i < list.size() / 2; i++) {
			List<Integer> temp = list.get(i);
			list.set(i, list.get(list.size() - 1 - i));
			list.set(list.size() - 1 - i, temp);
		}
		String s ="";
		String t = s +2 +"222";
		return list;
	}

	public void levelOrderBottom(TreeNode root, int level, List<List<Integer>> list) {
		if (root == null)
			return;
		if (list.size() <= level) {
			list.add(new ArrayList<>());
		}
		list.get(level).add(root.val);
		levelOrderBottom(root.left, level + 1, list);
		levelOrderBottom(root.right, level + 1, list);
	}
	/**
	 * Was thinking to create the Arraylist at upper level and add its children
	 * in it, which is bad because when the elements in the same level have
	 * different parents, it cannot add to the same list. 
	 * This algorithm prevents it because it uses an integer "Level" to guarantee the elements
	 * will be stored in the same "pool"
	 */
}
