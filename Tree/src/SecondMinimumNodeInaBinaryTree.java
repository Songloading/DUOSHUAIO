
public class SecondMinimumNodeInaBinaryTree {
	/**
	 * #671 Given a non-empty special binary tree consisting of nodes with the
	 * non-negative value, where each node in this tree has exactly two or zero
	 * sub-node. If the node has two sub-nodes, then this node's value is the
	 * smaller value among its two sub-nodes.
	 * 
	 * Given such a binary tree, you need to output the second minimum value in
	 * the set made of all the nodes' value in the whole tree.
	 * 
	 * If no such second minimum value exists, output -1 instead.
	 * Input: 
		    2
		   / \
		  2   5
		     / \
		    5   7
		
		Output: 5
		Explanation: The smallest value is 2, the second smallest value is 5.
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int least = Integer.MAX_VALUE;
	int sleast = Integer.MAX_VALUE;

	public int findSecondMinimumValue(TreeNode root) {
		if (root == null)
			return -1;
		helper(root);
		return Integer.MAX_VALUE == sleast ? -1 : sleast;
	}

	public void helper(TreeNode root) {
		if (root == null)
			return;
		if (root.val < least) {
			sleast = least;
			least = root.val;
		}
		if (root.val < sleast && root.val > least)
			sleast = root.val;
		helper(root.left);
		helper(root.right);
	}
/**
 *  3 cases here:
 *  1 Find new least, then we update least and turn second least to previous least.
 *  2 Find new node that between second least and least, then we turn second least to dat node
 *  3 All node have same value, then the second least wont change, which remains in MAX INTEGER VALUE, return -1.
 *  
 */
}
