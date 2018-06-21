import java.util.HashMap;

public class JewelsandStones {
/**
 *  Return how many characters in String S are also in J.
 *  Input: J = "aA", S = "aAAbbbb"
	Output: 3
 */
	public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> save = new HashMap<Character, Integer>();
        for(int i=0; i<J.length(); i++){
            save.put(J.charAt(i), 0);
        }
        int count = 0;
        for(int j=0; j<S.length(); j++){
            if(save.containsKey(S.charAt(j))) count++;
        }
        return count;
    }

	/** 
	 * Using contains of HashMap, nothing serious here.
	 */
}
