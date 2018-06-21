import java.util.HashMap;

public class MajorityElement {
/**
 * Return the number appears the most in the given array.
 */
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> tosave = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!tosave.containsKey(nums[i]))
				tosave.put(nums[i], 0);
			tosave.put(nums[i], tosave.get(nums[i]) + 1);
		}
		int max = 0;
		int n = 0;
		for (int k : tosave.keySet()) {
			if (max < tosave.get(k)) {
				max = tosave.get(k);
				n = k;
			}
		}
		return n;
	}
	
/** 
 * Classic way to count the number of appearance of each element.
 * Things need to remember: containsKey, put, get, "int k : to save.keySet()".
 */
}
