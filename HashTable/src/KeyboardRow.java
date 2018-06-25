import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {
/**
 * Given an array of strings, return the strings that formed by only one row on the keyboard.
 */
	public String[] findWords(String[] words) {
        HashMap<Character, Integer> db = new HashMap<Character, Integer>();
        ArrayList<String> retur = new ArrayList<String>();
        String g1 = "qwertyuiopQWERTYUIOP";
        String g2 = "asdfghjklASDFGHJKL";
        String g3 = "zxcvbnmZXCVBNM";
        for(int i=0; i<g1.length(); i++){
            db.put(g1.charAt(i), 1);
        }
        for(int j=0; j<g2.length(); j++){
            db.put(g2.charAt(j),2);
        }
        for(int k=0; k<g3.length(); k++){
            db.put(g3.charAt(k), 3);
        }
        int check = 0;
        for(int n=0; n<words.length; n++){
            if(!words[n].equals("")) check = db.get(words[n].charAt(0));
            int count=0;
            for(int l=0; l<words[n].length(); l++){
                if(check!=db.get(words[n].charAt(l))) break;
                count++;
            }
            if(count==words[n].length()) retur.add(words[n]); 
        }
        String[] toreturn = retur.toArray(new String[retur.size()]);
        return toreturn;
    }
/**
 *  1 Using hashmap to store characters of each row
 *  2 Loop thru the array and check
 *  Notice the method arraylist to array;
 */
}
