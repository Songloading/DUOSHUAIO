
public class ToeplitzMatrix {
/**
 * Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
	Output: True
	Explanation:
	1234
	5123
	9512

	In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"
 */
	 public boolean isToeplitzMatrix(int[][] matrix) {
	        int s=0;
	        for(int i=0; i<matrix.length; i++){
	            for(int n=0; n<matrix[i].length; n++){
	                s= matrix[i][n];
	             if(i!= matrix.length-1&&n!=matrix[i].length-1){
	                 if(matrix[i+1][n+1]!=s) return false;
	             }
	                
	            }
	        }
	        return true;
	    }
	 /**
	  * Everytime the only thing to check is matrix[i][n] ?= matrix[i+1][n+1]
	  */
}
