
public class MergeTwoBinaryTrees {
/**
 * Return the new tree formed by merging two trees.
 * Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
	Output: 
	After Merge:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        if(t1==null&&t2==null) return null;
	        if(t1==null)return t2;
	        if(t2==null)return t1;
	        TreeNode toreturn = new TreeNode(t1.val+t2.val);
	        toreturn.left = mergeTrees(t1.left, t2.left);
	        toreturn.right = mergeTrees(t1.right, t2.right);
	        return toreturn;
	    }
/** 
 *  1 Return null if both of t1 and t2 are nullnode
 *  2 Return t1 or t2 otherwise if t2 or t1 is null.(Notice dont return new node cause we might still have more 
 *  node linked after t1 or t2.
 *  3 Sum the val of t1 and t2 to form a new node
 *  4 Recursively set the left and right node of newly creat node to t1 and t2 lef/right.
 *  5 return dat new node.
 */
}
