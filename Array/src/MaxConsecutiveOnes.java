
public class MaxConsecutiveOnes {
/**
 * Return the maximum number of consecutive ones.
 * 		Input: [1,1,0,1,1,1]
		Output: 3
 */
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count++;
			if (nums[i] == 0)
				count = 0;

			max = Math.max(max, count);
		}
		return max;

	}
/**
 *  Nothing serious here...
 */
}
