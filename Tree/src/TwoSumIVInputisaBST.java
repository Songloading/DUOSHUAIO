import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class TwoSumIVInputisaBST {
/**
 * Return if two nodes can sum up to the given target.
	 * Input: 
	    5
	   / \
	  3   6
	 / \   \
	2   4   7
	
	Target = 9
	
	Output: True 
 *
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

	HashMap<Integer, Integer> db = new HashMap<Integer, Integer>();
	boolean check = false;

	public boolean findTarget(TreeNode root, int k) {
		store(root, k);
		for (Integer i : db.keySet()) {
			if (db.containsKey(db.get(i)) && !db.get(i).equals(i))
				return true;

		}
		db.clear();
		return check;
	}

	public void store(TreeNode root, int k) {
		if (root == null)
			return;
		if (db.containsKey(root.val) && root.val * 2 == k)
			check = true;
		db.put(root.val, k - root.val);
		store(root.left, k);
		store(root.right, k);
	}
	
	Set<Integer> set = new HashSet<>();
    public boolean findTarget2(TreeNode root, int k) {        
        if (root == null) return false;
        if (set.contains(k-root.val)) return true;
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
/**
 *  Was using hashmap to store everything and check
 *  The latter one was batter bacause it checks every new node, which avoids many extra work.
 */
}
