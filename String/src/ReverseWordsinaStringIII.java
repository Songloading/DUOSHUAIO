
public class ReverseWordsinaStringIII {
	/** #557
	 * Given a string, you need to reverse the order of characters in each word
	 * within a sentence while still preserving whitespace and initial word
	 * order.
	 * 
	 * Example 1: 
	 * Input: "Let's take LeetCode contest" 
	 * Output: "s'teL ekat edoCteeL tsetnoc"
	 */
	public String reverseWords(String s) {
        String[] each = s.split(" ");
        StringBuilder toreturn = new StringBuilder();
        for(int i=0; i<each.length; i++){
            toreturn.append(Reverse(each[i])+" ");
        }
        return toreturn.deleteCharAt(toreturn.length()-1).toString();
    }
    public String Reverse(String s){
        StringBuilder k = new StringBuilder(s);
        return k.reverse().toString();
    }
 /**
  *  It is very efficient to use string builder to form the new string.
  */
}