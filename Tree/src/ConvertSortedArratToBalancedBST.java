import java.util.ArrayList;

public class ConvertSortedArratToBalancedBST {
/**
 * Given a sorted array, convert it to a balanced BST
 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
     public TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if (start > end) {
        	ArrayList jesus = new ArrayList<>();
            return null;
        }

 
        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
 
        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(nums, start, mid - 1);
 
        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(nums, mid + 1, end);
         
        return node;
        }
/**
 * Classic algorithm here.
 */
}
