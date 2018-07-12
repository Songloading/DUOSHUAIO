
public class LongestPalindromicSubstring {
	/** #5
	 * Given a string s, find the longest palindromic substring in s. You may
	 * assume that the maximum length of s is 1000.
	 * Example 1:
		Input: "babad"
		Output: "bab"
		Note: "aba" is also a valid answer.
		
	   Example 2:
		Input: "cbbd"
		Output: "bb"

	 */
	public String longestPalindrome(String s) {
		int n = s.length();
		if (n < 2)
			return s;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j <= n - i; j++) {
				if (isPalindromic(s.substring(j, j + i)))
					return s.substring(j, j + i);
			}
		}
		return null;
	}

	public boolean isPalindromic(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}

	/**
	 * Using 3 loops to traverse the string (w/o backward or storing/comparing),
	 * the trick is to use 2 pointers at beginning and end of the string, and
	 * returns the first one, since dat should be the longest. Runtime O(n^3),
	 * Space linearly.
	 */
	private int lo, maxLen;

	public String longestPalindrome2(String s) {
		int len = s.length();
		if (len < 2)
			return s;

		for (int i = 0; i < len - 1; i++) {
			extendPalindrome(s, i, i); // assume odd length, try to extend
										// Palindrome as possible
			extendPalindrome(s, i, i + 1); // assume even length.
		}
		return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
	/**
	 * Smart and high performance here. Using 2 loops, outer loop to traverse
	 * all the characters, and inner loop to "spread" check in 2 directions.
	 * Runtime O(n^2), Space linearly.
	 */
}
