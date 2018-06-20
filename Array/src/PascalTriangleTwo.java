import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
/**
 * Given the rowIndex, return the corresponding row of PascalTriangle
 * Input: 3
   Output: [1,3,3,1]
 */
	
	  public List<Integer> getRow(int rowIndex) {
	        List<Integer> toreturn = new ArrayList<Integer>();
	        if(rowIndex<0) return toreturn;
	        for(int j=0; j<rowIndex+1; j++){
	            toreturn.add(0,1);
	            for(int i=1; i<toreturn.size()-1; i++){
	                toreturn.set(i, toreturn.get(i)+toreturn.get(i+1));
	            }
	        }
	        return toreturn;
	    }
/**
 * Same thing.
 */
}
