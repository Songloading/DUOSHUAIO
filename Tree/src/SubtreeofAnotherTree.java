

public class SubtreeofAnotherTree {
	/** #572
	 * Given two non-empty binary trees s and t, check whether tree t has
	 * exactly the same structure and node values with a subtree of s. A subtree
	 * of s is a tree consists of a node in s and all of this node's
	 * descendants. The tree s could also be considered as a subtree of itself.
	 * Example 1:
	Given tree s:
	
	     3
	    / \
	   4   5
	  / \
	 1   2
	Given tree t:
	   4 
	  / \
	 1   2
	Return true, because t has the same structure and node values with a subtree of s.
    Example 2:
	Given tree s:
	
	     3
	    / \
	   4   5
	  / \
	 1   2
	    /
	   0
	Given tree t:
	   4
	  / \
	 1   2
	Return false.
	 */
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) {
			val = val;
		}
	}
	 public boolean isSubtree(TreeNode s, TreeNode t) {
	        if(s==null && t==null) return true;
	        if(s==null) return false;
	        if(t==null) return true;
	        return Same(s, t)||isSubtree(s.left, t)|| isSubtree(s.right, t);
	     }
	    public boolean Same(TreeNode s, TreeNode t){
	         if(s==null && t==null) return true;
	         if(s==null || t==null) return false;
	         if(s.val!=t.val) return false;
	         return Same(s.left, t.left)&& Same(s.right, t.right);
	    }
/**
 *  Travese to the aiming node(t) first and check if the subtree is same.
  */
	
}
