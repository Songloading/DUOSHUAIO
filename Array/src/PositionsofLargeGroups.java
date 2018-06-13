import java.util.ArrayList;
import java.util.List;

public class PositionsofLargeGroups {
	/**
	 * In a string S of lowercase letters, these letters form consecutive groups
	 * of the same character.
	 * 
	 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb",
	 * "xxxx", "z" and "yy".
	 * 
	 * Call a group large if it has 3 or more characters. We would like the
	 * starting and ending positions of every large group.
	 * 
	 * The final answer should be in lexicographic order.
	 */

	public List<List<Integer>> largeGroupPositions(String S) {
		ArrayList toreturn = new ArrayList<>();
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < S.length(); i += count2 + 1) {
			char a = S.charAt(i);
			int j = i;
			if (j < S.length()) {
				while (S.charAt(j) == a) {
					System.out.println(i);
					j++;
					count++;
					if (j >= S.length()) {
						break;
					}
				}
			}
			j--;
			if (count >= 3) {
				ArrayList k = new ArrayList<>();
				k.add(i);
				k.add(j);
				toreturn.add(k);
				count2 = count - 1;
			} else {
				count2 = 0;
			}
			count = 0;

		}
		return toreturn;
	}
	
	/**
	 * Several shit here:
	 * 1 how to check every element's repetition
	 * 2 when find someone's appearance is more than 3, how to stop and store the indices
	 * 3 how to jump(avoid repetitive counting) when we want to keep checking after recognizing large group.
	 */
}
