import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AverageofLevelsinBinaryTree {
/**
 * 
	 * Input:
	    3
	   / \
	  9  20
	    /  \
	   15   7
	Output: [3, 14.5, 11]
	Explanation:
	The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. 
	Hence return [3, 14.5, 11].
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

	ArrayList<Double> result = new ArrayList<Double>();
	HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
	

	public List<Double> averageOfLevels(TreeNode root) {
		averageOfLevels(root, 0);
		double sum = 0;
		double count = 0;
		int i = 0;
		while (store.containsValue(i)) {
			for (Integer k : store.keySet()) {
				if (store.get(k) == i) {
					sum += k;
					count++;
				}
			}
			result.add(sum / count);
			sum = count = 0;
			i++;
		}
		return result;
	}

	public void averageOfLevels(TreeNode root, int level) {
		if (root == null)
			return;
		store.put(root.val, level);
		averageOfLevels(root.left, level + 1);
		averageOfLevels(root.right, level + 1);
	}
	
	public List<Double> averageOfLevels2(TreeNode root) {
		List<Double> list = new ArrayList<>();
		if (root == null)
			return list;
		List<TreeNode> line = new ArrayList<>();
		line.add(root);
		levelOrderTraverse(line, list);
		return list;
	}

	void levelOrderTraverse(List<TreeNode> line, List<Double> list) {
		if (line == null || line.size() == 0)
			return;
		double sum = 0;
		List<TreeNode> newLine = new ArrayList<>();
		for (TreeNode node : line) {
			sum += node.val;
			if (node.left != null)
				newLine.add(node.left);
			if (node.right != null)
				newLine.add(node.right);
		}
		list.add( sum / (double) line.size());
		levelOrderTraverse(newLine, list);
	}
	
/**
 * Was wrong with very first algorithm because hashmap cannot contain duplicate keys.
 * Using two list to keep track of each level, recursively adding two levels and store each one's average.
 */
}
