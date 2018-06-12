
public class FlippinganImage {
/**
 Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
	 public int[][] flipAndInvertImage(int[][] A) {
	        for (int i =0; i< A.length; i++){
	            for (int n =0; n<A[i].length/2; n++){
	                int s=0;
	                s=A[i][n];
	                A[i][n]=A[i][A[i].length-1-n];
	                A[i][A[i].length-1-n]=s;
	            }
	            for (int k=0; k<A[i].length; k++){
	                if(A[i][k]==1){
	                    A[i][k]=0;
	                }else{
	                    A[i][k]=1;
	            }
	        }
	        }
	        return A;
	    }
	
	 
	 /**
	  *  Outer loop: looping thru 2d array
	  *  inner loop1: flipping each element
	  *  inner loop2: invert each one
	  */
}
