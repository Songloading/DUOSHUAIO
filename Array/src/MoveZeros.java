import java.util.HashMap;

public class MoveZeros {
/**
 * Move all the zeros to the end of the array, and keep anything else in order.
 * 	  Input: [0,1,0,3,12]
      Output: [1,3,12,0,0]
 */
	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int k = i;
			if (nums[i] == 0) {
				while (nums[k] == 0) {
					k++;
					if (k == nums.length) {
						k--;
						break;
					}
				}
				nums[i] = nums[k];
				nums[k] = 0;
			}
		}
	}
/**
 * Notice the trick is to replace zero with the first "valid number".
 */
}
