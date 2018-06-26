
public class BalancedBinaryTree {
/**
 * Return true if the Tree is balanced, false othersie;
 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	boolean result =true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        height(root);
        return result;
        }
    
    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1) result = false;
        return 1+ Math.max(left, right);
    }
/**
 *  Thinking to go check every node previously, but the runtime is about O(n^2)
 *  Better to have a boolean to check when getting height of the root.
 */
}
