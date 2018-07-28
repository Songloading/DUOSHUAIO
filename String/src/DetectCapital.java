
public class DetectCapital {
	/**
	 * #520
	 * We define the usage of capitals in a word to be right when one of the
	 * following cases holds:
	 * All letters in this word are capitals, like "USA". 
	 * All letters in this
	 * word are not capitals, like "leetcode". 
	 * Only the first letter in this
	 * word is capital if it has more than one letter, like "Google".
	 * Otherwise, we define that this word doesn't use capitals in a right way.
	 */
	
	 public boolean detectCapitalUse(String word) {
	        int count =0;
	        char[] array = word.toCharArray();
	        for(int i=0; i<array.length; i++){
	            if(Character.isUpperCase(array[i])) count++;
	        }
	        if(count==array.length||count==0) return true;
	        if(count==1&&Character.isUpperCase(array[0])) return true;
	        return false;
	    }
/**
 * Nothing Serious.
 */
}
