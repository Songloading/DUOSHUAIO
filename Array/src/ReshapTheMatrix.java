import java.util.ArrayList;

public class ReshapTheMatrix {
/**
 * Given a matrix and wanted row and column after reshap, reshap the matrix.
 * input: 				
	nums = 
	[[1,2],
	 [3,4]]
	r = 1, c = 4
	output: 
	[[1,2,3,4]]
	input: 
	nums = 
	[[1,2],
	 [3,4]]
	r = 2, c = 4
	output: 
	[[1,2],
	 [3,4]]
 */
	 public int[][] matrixReshape(int[][] nums, int r, int c) {
	        int[][] toreturn = new int[r][c];
	        ArrayList<Integer> tosave = new ArrayList<>();
	        for(int i=0; i<nums.length; i++){
	            for(int j=0; j<nums[i].length;j++){
	                tosave.add(nums[i][j]);
	            }
	        }
	        if(tosave.size()!= r*c) return nums;
	        int count = 0;
	        for(int i=0; i<r; i++){
	            for(int j=0; j<c; j++){
	                toreturn[i][j] = tosave.get(count);
	                System.out.println(count);
	                count++;
	            }
	        
	        }
	        return toreturn;
	    }
	 /**
	  * 1 save all the elements of original matrix in order
	  * 2 check if we can reshap it
	  * 3 put the elements in to the "shaped" 2D array.
	  */
	
}
