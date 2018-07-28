import java.util.HashMap;
import java.util.HashSet;

public class CustomSortString {
	/** #791
	 * S and T are strings composed of lowercase letters. In S, no letter occurs
	 * more than once.
	 * 
	 * S was sorted in some custom order previously. We want to permute the
	 * characters of T so that they match the order that S was sorted. More
	 * specifically, if x occurs before y in S, then x should occur before y in
	 * the returned string.
	 * 
	 * Return any permutation of T (as a string) that satisfies this property.
	 * Example :
		Input: 
		S = "cba"
		T = "abcd"
		Output: "cbad"
		Explanation: 
		"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a". 
		Since "d" does not appear in S, dcba", "cdba", "cbda" are also valid outputs.
	 */
	 public String customSortString(String S, String T) {
	        HashSet<Character> store = new HashSet<Character>();   // store every character in S
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // store the number of char.
	        StringBuilder sb = new StringBuilder();
	        for(char c : S.toCharArray()){
	            store.add(c); 
	        } 
	        for(char l : T.toCharArray()){
	            if(!store.contains(l)) sb.append(l); //if it is not in S, we just append it.
	            if(!map.containsKey(l)) map.put(l, 0);
	            map.put(l, map.get(l)+1); // if it is in S, we count its number
	        }
	        for(char k : S.toCharArray()){
	           if(!map.containsKey(k)) continue; // if the char in S not in T, we just ignore it.
	           for(int i=0; i<map.get(k); i++){
	               sb.append(k);  // Append the char in order based on its number in T.
	           }
	        }
	        return sb.toString();
	    }
	 /**
	  *  Using three loops:
	  *  1 store every char in S
	  *  2 store the corresponding char in T to the map
	  *  3 append the char to form the string.
	  */
}
