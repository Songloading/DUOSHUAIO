import java.util.Arrays;

public class MaximumProductofThreeNumbers {
/**
 * Return the maximum product of three numbers in an array
 */
	
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length;
        return Math.max(nums[k-1]*nums[0]*nums[1],nums[k-1]*nums[k-2]*nums[k-3]);
    }
/**
 * Be careful of the negative numbers there
 * Three case:
 * 1 All negative
 * 2 All positive
 * 3 Should conclude two negative numbers, which is nums[0,1].
 */
}
