import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
/**
 * 	Input: 5
	Output:
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
	Given the number of rows, return the corresponding PascalTriangle.
 */
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> toreturn = new ArrayList<List<Integer>>();
        if(numRows<1) return toreturn;
        List<Integer> rows = new ArrayList<Integer>();
        for(int i =0; i<numRows; i++){
           rows.add(0,1);
           for(int j=1; j<rows.size()-1; j++){
               rows.set(j, rows.get(j)+rows.get(j+1));
           }
           toreturn.add(new ArrayList<Integer>(rows));
       }
       return toreturn;
    }
/**
 *  1 When needed to repeatedly add an arraylist, use the quotes backside!!!!!
 *  2 arraylist.add(int, something) will push the current element back
 *  
 */
}
