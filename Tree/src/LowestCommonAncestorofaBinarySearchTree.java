import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LowestCommonAncestorofaBinarySearchTree {
	/* #235
	 * Given a binary search tree (BST), find the lowest common ancestor (LCA)
	 * of two given nodes in the BST.
	 * 
	 * According to the definition of LCA on Wikipedia: “The lowest common
	 * ancestor is defined between two nodes p and q as the lowest node in T
	 * that has both p and q as descendants (where we allow a node to be a
	 * descendant of itself).”
	 * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]

		        _______6______
		       /              \
		    ___2__          ___8__
		   /      \        /      \
		   0      _4       7       9
		         /  \
		         3   5
		Example 1:
		
		Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
		Output: 6
		Explanation: The LCA of nodes 2 and 8 is 6.
	 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	HashMap<TreeNode, List<TreeNode>> map = new HashMap<TreeNode, List<TreeNode>>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        List<TreeNode> start = new ArrayList<TreeNode>();
        Path(root, start);
        System.out.println(map.get(p));
        System.out.println(map.get(q));
        for(int i=map.get(p).size()-1; i>-1; i--){
            TreeNode s = map.get(p).get(i);
            if(map.get(q).contains(s)) return s;
        }
        
        return root;
    }
    public void Path(TreeNode root, List<TreeNode> record){
        if(root==null) return;
        List<TreeNode> n = new ArrayList<TreeNode>(record);
        n.add(root);
        map.put(root, n);
        Path(root.left, n);
        Path(root.right, n);
    }
    /**
     *  Using a list to record the passed node and a Hashmap to store the current Node and the nodes it passed.
     *  Then compare "backwards" of two nodes, because we want to down->upper way but we store the nodes
     *  in upper->down way.
     */ 
}
