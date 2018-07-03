import java.util.ArrayList;

public class ConvertBSTtoGreaterTree {
	/**
	 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
	 * every key of the original BST is changed to the original key plus sum of
	 * all keys greater than the original key in BST.
			 * Input: The root of a Binary Search Tree like this:
		              5
		            /   \
		           2     13
		
			   Output: The root of a Greater Tree like this:
				       18
	         		 /   \
				   20     13
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	ArrayList<Integer> db = new ArrayList<Integer>();

	public TreeNode convertBST(TreeNode root) {
		store(root);
		System.out.println(db);
		return convert(root);
	}

	public void store(TreeNode root) {
		if (root == null)
			return;
		db.add(root.val);
		store(root.left);
		store(root.right);
	}

	public TreeNode convert(TreeNode root) {
		if (root == null)
			return null;
		int nval = root.val;
		root.left = convert(root.left);
		root.right = convert(root.right);
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i) > root.val)
				nval += db.get(i);
		}
		root.val = nval;
		return root;
	}
	
	
	int sum = 0;

	public TreeNode convertBST2(TreeNode root) {
		if (root == null)
			return null;

		convertBST(root.right);

		root.val += sum;
		sum = root.val;

		convertBST(root.left);

		return root;
	}
	/**
	 * Method 1: Using an arraylist to store verything and check each node to
	 * add, which is O(n^2) 
	 * Method 2: Logic behind this is that first check iz
	 * rightnode, then itself, and left one. The whole process is cumulative, so
	 * we just keep track of the adding value.
	 */
}
