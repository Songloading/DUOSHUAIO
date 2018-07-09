import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {
/** #101
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
   For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
	
	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3
	But the following [1,2,2,null,3,null,3] is not:
	    1
	   / \
	  2   2
	   \   \
	   3    3
 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        TreeNode right = reverse(root.right);
        return isSame(root.left, right);
    }
    public boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val!=root2.val) return false;
        return (isSame(root1.left, root2.left) && isSame(root1.right, root2.right));
    }
    public TreeNode reverse(TreeNode root){
        if(root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.left = reverse(root.right);
        node.right = reverse(root.left);
        return node;
    }
/**
    1 Check if the tree is empty, return true if so.
	2 Ok now we guarantee that it contains at least one node, and we can reverse the right subtree!
	3 Lets check if we get our left tree!
 */
    public boolean isSymmetric2(TreeNode root) {
        if(root == null)
            return true;
        Queue<TreeNode> q = new LinkedList();
        LinkedList jesus = new LinkedList();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if(left == null && right == null)
                continue;
            if(left == null || right == null ||left.val != right.val )
                return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
   }
   /** Iteral
    *  Looply add nodes and check corresponding ones.
    */
}
