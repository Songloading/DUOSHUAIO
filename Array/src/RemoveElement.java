
public class RemoveElement {
	/** #27
	 * Given an array nums and a value val, remove all instances of that value
	 * in-place and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this by
	 * modifying the input array in-place with O(1) extra memory.
	 * 
	 * The order of elements can be changed. It doesn't matter what you leave
	 * beyond the new length.
	 */
	
	 public int removeElement(int[] nums, int val) {
		    int i = 0;
		    for (int j = 0; j < nums.length; j++) {
		        if (nums[j] != val) {
		            nums[i] = nums[j];
		            i++;
		        }
		    }
		    return i;
		    }
	 /**
	  * This problem is tricky because it only allows to use instant O(1) memory, and needed to count how many
	  * targets and sort at the same time.
	  */
}
