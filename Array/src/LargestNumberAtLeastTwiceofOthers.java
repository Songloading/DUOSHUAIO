import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
/**
 * If the largest number in an array is larger than twice of others, then return the index of dat number
 * Otherwise return -1;
 */
	public int dominantIndex(int[] nums) {
        if(nums.length==1) return 0;
        int[] newn = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            newn[i] = nums[i];
        }
        Arrays.sort(newn);
        int k = newn[newn.length-1];
        int l = newn[newn.length-2];
        if(k>= (l*2)){
            for(int j =0; j<nums.length; j++){
                if(nums[j]==k) return j;
            }
        }
        return -1;
    }
/**
 *  Two step:
 *  1 Find largest and second largest elment
 *  2 Find corresponding index
 *  3 Check and return;
 */
	
}
