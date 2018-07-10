import java.util.ArrayList;

public class PathSumIII {
	/** #437
	 * You are given a binary tree in which each node contains an integer value.
	 * Find the number of paths that sum to a given value.
	 * The path does not need to start or end at the root or a leaf, but it must
	 * go downwards (traveling only from parent nodes to child nodes).
	 * The tree has no more than 1,000 nodes and the values are in the range
	 * -1,000,000 to 1,000,000.
	 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

		      10
		     /  \
		    5   -3
		   / \    \
		  3   2   11
		 / \   \
		3  -2   1
		
		Return 3. The paths that sum to 8 are:
		
		1.  5 -> 3
		2.  5 -> 2 -> 1
		3. -3 -> 11
	 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	int count = 0;
	public int pathSum(TreeNode root, int sum) {
		if (root == null && sum != 0)
			return 0;
		ArrayList<Integer> start = new ArrayList<Integer>();
		Traverse(root, 0, sum, start);
		return count;
	}

	public void Traverse(TreeNode root, int level, int sum, ArrayList<Integer> sofar) {
		if (root == null)
			return;
		int s = sofar.size();
		if (level > s)
			return;
		ArrayList<Integer> update = new ArrayList<Integer>(sofar);
		update.add(root.val);
		if (root.val == sum)
			count++;
		for (int i = 0; i < level; i++) {
			if (root.val + sofar.get(s - 1 - i) == sum)
				count++;
			update.add(root.val + sofar.get(s - 1 - i));
		}
		Traverse(root.left, level + 1, sum, update);
		Traverse(root.right, level + 1, sum, update);
	}
	/**
	 *  Runtime is about O(n) but it is really space consuming since it creates an ArrayList every node, which
	 *  is O(n^2)
	 */
	public int pathSum2(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0) 
            + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
    /**
     *  Very smart solution, using DFS.
     *  Check 2 possible ways(sum+node, node+node) in 2 methods.
     *  Runtime O(n^2), Space Complexity O(n) because of the recursion.
     */
}
