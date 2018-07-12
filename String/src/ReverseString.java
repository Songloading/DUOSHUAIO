
public class ReverseString {
	/** #344
	 * Write a function that takes a string as input and returns the string reversed.
	 * 
	 */
	 public String reverseString(String s) {
	        String reverseString = "";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	           reverseString = reverseString + s.charAt(i);
	        }
	        return reverseString;
	    }
	 /**
		 * In Java, String objects are immutable. Hence whenever you are
		 * concatenating two strings using '+', a new set of memory is
		 * allocated.Also, the complexity of concatenating two strings of length M1
		 * and M2 would be O(M1 + M2), since it tries to copy each character one by
		 * one from both strings to the freshly allocated memory. Hence your overall
		 * time complexity would be (0+1) + (1+1) + (2+1) + (3+1)....+(N+1) =
		 * N*(N+1)/2 + N = O(N^2). Hence your time limit should be exceeding for a
		 * very large input. The whole idea is to use StringBuilder or StringBuffer
		 * where the concatenation takes O(1) time.
		 */
	public String reverseString2(String s) {
	      StringBuilder b = new StringBuilder();
	      for(int i=s.length()-1; i >-1; i--){
	            b.append(s.charAt(i));
	        }
	        return b.toString();
	    }
	public String reverseString3(String s) {
	      StringBuilder b = new StringBuilder(s);
	      b.reverse();
	      return b.toString();
	    }
}
