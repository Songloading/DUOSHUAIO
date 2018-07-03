public class ConstructStringfromBinaryTree {
/**
	 * Input: Binary tree: [1,2,3,4]
	       1
	     /   \
	    2     3
	   /    
	  4     
	
	Output: "1(2(4))(3)"
	
	Explanation: Originallay it needs to be "1(2(4)())(3()())", 
	but you need to omit all the unnecessary empty parenthesis pairs. 
	And it will be "1(2(4))(3)".
 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public String tree2str(TreeNode t) {
		if (t == null)
			return "";
		if (t.left == null && t.right == null) {
			return "" + t.val;
		}
		String left = tree2str(t.left);
		if (t.right == null) {
			return t.val + "(" + left + ")";
		}
		String right = tree2str(t.right);
		String toreturn = t.val + "(" + left + ")" + "(" + right + ")";
		return toreturn;
	}
/**
 * Find pattern and recursively return here, nothing serious.
 * Notice to check if left or right is null, check the node directly rather than the result, will save runtime.
 */
}
