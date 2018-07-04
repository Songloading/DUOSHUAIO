import java.util.HashSet;

public class UniqueMorseCodeWords {
	/**
	 * Return how many unique morse codes in the given array. 
	 * Example: 
	 * Input:
	 * words = ["gin", "zen", "gig", "msg"] 
	 * Output: 2 
	 * Explanation: The transformation of each word is: 
	 * "gin" -> "--...-." "zen" -> "--...-."
	 * "gig" -> "--...--." "msg" -> "--...--."
	 * 
	 * There are 2 different transformations, "--...-." and "--...--.".
	 */
	String[] codes ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> result = new HashSet<String>();
        String turn = "";
        int count=0;
        for(int j=0; j<words.length; j++){
            for(int k=0; k<words[j].length(); k++){
                turn += codes[words[j].charAt(k) - 'a'];
            }
            if(!result.contains(turn)){
                result.add(turn);
                count++;
            }
            turn = "";
        }
        return count;
    }
 /**
  *  Using a hashset function "contains" to check.
  */
}
