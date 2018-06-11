
public class FindPivotIndex {
/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */
	
	public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for (int i =0; i<nums.length; i++){
            if(i!=0) left += nums[i-1]; 
            for( int n=i; n<nums.length; n++){
                if(n!=nums.length-1) right += nums[n+1]; 
            }
            if(left == right) return i;
            right = 0;
        }
        return -1;
    }
}
