import java.util.HashMap;

public class JudgeRouteCircle {
	/** #657
	 * Initially, there is a Robot at position (0, 0). Given a sequence of its
	 * moves, judge if this robot makes a circle, which means it moves back to
	 * the original place.
	 * 
	 * The move sequence is represented by a string. And each move is represent
	 * by a character. The valid robot moves are R (Right), L (Left), U (Up) and
	 * D (down). The output should be true or false representing whether the
	 * robot makes a circle.
	 * 
	 * Example 1:
	 * Input: "UD"
	   Output: true
	   Example 2:
	   Input: "LL"
	   Output: false
	 */
	public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> store = new HashMap<Character, Integer>();
        store.put('U', 0);
        store.put('D', 0);
        store.put('L', 0);
        store.put('R', 0);
        for(int i=0; i<moves.length(); i++){
            if(!store.containsKey(moves.charAt(i))) store.put(moves.charAt(i), 0);
            store.put(moves.charAt(i), store.get(moves.charAt(i))+1);
        }
        return store.get('U').equals(store.get('D')) && store.get('L').equals(store.get('R'));
    }
/**
 *  Notice we use ".equals" here, this is because integer comparison larger than 128 might generate trouble when
 *  using "==".
 */
}
