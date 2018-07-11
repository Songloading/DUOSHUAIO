
public class ValidPalindrome {
	/** #125
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 * Example 1:
			Input: "A man, a plan, a canal: Panama"
			Output: true
	   Example 2:
			Input: "race a car"
			Output: false
	 */
	public boolean isPalindrome(String s) {
        for(int j=0; j<s.length(); j++){
            if(!Character.isAlphabetic(s.charAt(j))&&!Character.isDigit(s.charAt(j))){
                s = s.replace(s.charAt(j), ' ');
            }
        }
        s =s.replaceAll(" ", "");
        System.out.println(s);
        for(int i=0; i<s.length()/2; i++){
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase((s.charAt(s.length()-1-i)))) return false;
        }    
        return true;
    }
	/**
	 *  First loop: Removing every char dat is not alphanumeric.
	 *  Second loop: check if it is palindrome.
	 *  Runtime O(n), Space O(1)
	 */
	public boolean isPalindrome2(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
	/**
	 *  Elegant solution, notice the method dat can eliminate the non-alphanumeric character.
	 *  Runtime O(1), Space O(n).
	 */
	
}
