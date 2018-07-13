import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
	/** #282
	 * Given a string that contains only digits 0-9 and a target value, return
	 * all possibilities to add binary operators (not unary) +, -, or * between
	 * the digits so they evaluate to the target value.
	 * 
	 * Example 1:
	 * Input: num = "123", target = 6 Output: ["1+2+3", "1*2*3"] 
	 * 
	 * Example 2:
	 * Input: num = "232", target = 8 Output: ["2*3+2", "2+3*2"] 
	 * 
	 * Example 4:
	 * Input: num = "00", target = 0 Output: ["0+0", "0-0", "0*0"] 
	 * 
	 * Example 5:
	 * Input: num = "3456237490", target = 9191 Output: []
	 * 
	 * Example 6:
	 * Input: num = "124", target = 16 output:["12+4"]
	 */
	 public List<String> addOperators(String num, int target) {
	        List<String> rst = new ArrayList<String>();
	        if(num == null || num.equals("")) return rst;
	        helper(rst, "", num, target, 0, 0, 0);
	        return rst;
	    }
	    public void helper(List<String> rst, String path, String num, int target, int pos, long eval, long multed){
	        if(pos == num.length()){
	            if(target == eval)
	                rst.add(path);
	            return;
	        }
	        for(int i = pos; i < num.length(); i++){
	            if(i != pos && num.charAt(pos) == '0') break;
	            long cur = Long.parseLong(num.substring(pos, i + 1));
	            if(pos == 0){
	                helper(rst, path + cur, num, target, i + 1, cur, cur);
	            }
	            else{
	                helper(rst, path + "+" + cur, num, target, i + 1, eval + cur , cur);
	                
	                helper(rst, path + "-" + cur, num, target, i + 1, eval -cur, -cur);
	                
	                helper(rst, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur );
	            }
	        }
	    }
	 /**
	 * Basic idea: Recursively adding all possible expressions and store it to
	 	 * the list if it is equal to target.
	 * For Helper Function: The outer loop pointer i presents the start point of every expression,
		 * for example, 1+2+3 starts with 1, 12+3 starts with 2. So the "pos" keeps track of the starting point of
		 * each recursion.
	 * For each loop, the "substring(pos, i + 1)" keeps track of binding numbers, and "else{}" case keeps track
	 	 * of the adding operators between i and i+1 and further.
	 * The "multed" here are used for multiplication case. If we meet a * case, we need to get the previous
		 * number back. For example, 1+2*3, recursively, it will compute 1+2=3 first and we find 3*3, then it 
		 * needs to compute back (3-2)+2*3 in this case.
	 */  
}