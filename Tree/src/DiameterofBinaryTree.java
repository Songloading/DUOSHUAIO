public class DiameterofBinaryTree {
	/** #543
	 * Given a binary tree, you need to compute the length of the diameter of
	 * the tree. The diameter of a binary tree is the length of the longest path
	 * between any two nodes in a tree. This path may or may not pass through
	 * the root.
	 * Given a binary tree 
		          1
		         / \
		        2   3
		       / \     
		      4   5    
		Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
	 */
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	    int max;
	    public int diameterOfBinaryTree(TreeNode root) {
	        dbt(root);
	        return max;
	        
	    }
	    public int dbt(TreeNode root){
	        if(root==null) return 0;
	        int count=0;
	        count = MaxDepth(root.left)+MaxDepth(root.right);
	        max = Math.max(count, max);
	        return dbt(root.left) + dbt(root.right);
	    }
	    public int MaxDepth(TreeNode root){
	        if(root ==null) return 0;
	        return 1+Math.max(MaxDepth(root.left), MaxDepth(root.right));
	    }
/**
 *  Method 1: Using "MaxDepth" function to check the max depth of right and left sub tree.
 *  	   2: Recursively adding right and left subtree's depth and check every node to comparee. 
 */
}
