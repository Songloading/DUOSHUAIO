
public class BinaryTreeTilt {
	
	/** #563
	 * 
	 * Given a binary tree, return the tilt of the whole tree.
	 * 
	 * The tilt of a tree node is defined as the absolute difference between the
	 * sum of all left subtree node values and the sum of all right subtree node
	 * values. Null node has tilt 0.
	 * 
	 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
	 * Input: 
		         1
		       /   \
		      2     3
		Output: 1
		Explanation: 
		Tilt of node 2 : 0
		Tilt of node 3 : 0
		Tilt of node 1 : |2-3| = 1
		Tilt of binary tree : 0 + 0 + 1 = 1
	 *
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int sum = 0;

	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		findTiltUtil(root);
		return sum;
	}

	private int findTiltUtil(TreeNode root) {
		int left = 0, right = 0;
		if (root == null)
			return 0;
		left = findTiltUtil(root.left);
		right = findTiltUtil(root.right);
		sum += Math.abs(left - right);
		return root.val + left + right;
    }    
/** Was thinking to calculate the tilt at lower level on the "children level"
 *  However,
 *  The problem here is that we need to keep track of the tilt at this level and its children level.
 *  So, we add "root.val" here to update, which is returning the both root.val to the parent and calculate the
 *  tilt at parent level.
 *  
 */
}
