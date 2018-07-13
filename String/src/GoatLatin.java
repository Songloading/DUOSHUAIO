
public class GoatLatin {
	/** 
	 * #824
	 * A sentence S is given, composed of words separated by spaces. Each word
	 * consists of lowercase and uppercase letters only.
	 * 
	 * We would like to convert the sentence to "Goat Latin" (a made-up language
	 * similar to Pig Latin.)
	 * 
	 * The rules of Goat Latin are as follows:
	 * 
	 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end
	 * of the word. For example, the word 'apple' becomes 'applema'.
	 * 
	 * If a word begins with a consonant (i.e. not a vowel), remove the first
	 * letter and append it to the end, then add "ma". For example, the word
	 * "goat" becomes "oatgma".
	 * 
	 * Add one letter 'a' to the end of each word per its word index in the
	 * sentence, starting with 1. For example, the first word gets "a" added to
	 * the end, the second word gets "aa" added to the end and so on. Return the
	 * final sentence representing the conversion from S to Goat Latin.
	 * Example 1:
		Input: "I speak Goat Latin"
		Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
	 */
	 public String toGoatLatin(String S) {
	        StringBuilder sb = new StringBuilder();
	        String[] array = S.split(" ");
	        int n = array.length;
	        for(int i=0;i<n;i++){
	            sb.append(Transform(array[i]));
	            for(int j=0; j<i+1; j++){
	                sb.append("a");
	            }
	            sb.append(" ");
	        }
	        return sb.deleteCharAt(sb.length()-1).toString();
	    }
	    
	    public String Transform(String s){
	        StringBuilder sb = new StringBuilder(s);
	        char c = s.charAt(0);
	        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
	            sb.append("ma");
	        }else{
	            sb.deleteCharAt(0);
	            sb.append(c+"ma");
	        }
	        return sb.toString();
	    }
/**
 *  Using string builder to build the target string.
 */
}
